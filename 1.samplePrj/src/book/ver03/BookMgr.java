package book.ver03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();

	public BookMgr() throws FileNotFoundException {
		String fileName = "c://file/sample1.txt"; // �����ּ�.
		try (Scanner s = new Scanner(new File(fileName))) {
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}
	}

	public BookMgr(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book data) { //���� �߰�
		bookList.add(data);
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).display();

		}
	}

	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	// �˻�
	public void searchBookList(String title) {
		boolean fleg = false;
		System.out.println("�˻� ������ ���.");
		for (Book data : bookList) {
			if (data.getTitle().equalsIgnoreCase(title)) {
				System.out.println(data + "�˻��Ͻ� ������ ã�ҽ��ϴ�.");
				fleg = true;
			}
		}
		if (fleg == false) {
			System.out.println("��û�� ������ �����ϴ�.");
		}
	}

	// ����
	public void delete(String title) { 
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("������ �����Ͽ����ϴ�. : " + book);
				it.remove();
			}
		}
	}

	// ����
	public void update(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.println("å�� ���ο� ������ �Է��ϼ���.");
				Scanner s = new Scanner(System.in);
				String s1 = s.nextLine();
				System.out.println("å�� ���ο� ������ �Է��ϼ���.");
				String s2 = s.nextLine();
				bookList.get(i).setTitle(s1);
				bookList.get(i).setPrice(Integer.parseInt(s2));
				System.out.printf("%s�� ������ �����Ǿ����ϴ�.%n", title);
			}
		}

	}
}