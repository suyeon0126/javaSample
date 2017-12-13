package book.ver02;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMgr {
	private ArrayList<Book> bookList = new ArrayList<Book>();

	public BookMgr() {
		super();
	}

	public BookMgr(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public void addBook(Book data) {
		bookList.add(data);
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public void printTitleList() {
		for (int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	// �˻� ��� �߰�
	public void searchBookList(String title) {
		int i;
		boolean fleg = false;
		System.out.println("�˻� ������ ���.");
		for (i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				bookList.get(i).display();
				fleg = true;
			}
		}
		if (fleg == false) {
			System.out.println("��û�� ������ �����ϴ�.");
		}
	}

	// ���� ��� �߰�.
	public void delete(String title) { //Iterator�� ����.
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.print("�����մϴ�.");
				bookList.get(i).display();
				System.out.println(bookList.get(i) + "���� ������");
				bookList.remove(i);
				break;
			}
		}
	}

	// ���� ��� �߰�.
	public void update(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.println("å�� ����� ������ �����մϴ�.");
				Scanner s = new Scanner(System.in);
				String s1 = s.nextLine();
				System.out.println("������ å�� ���ο� ������ �Է��ϼ���.");
				String s2 = s.nextLine();
				bookList.get(i).setTitle(s1);
				bookList.get(i).setPrice(Integer.parseInt(s2));
				System.out.printf("%s�� ������ �����Ǿ����ϴ�.%n", title);
			}
		}
		
	}
}

// �����ð��� �� �߰��� ��. �˻� ��ҹ��� ���� ��� �߰�.
