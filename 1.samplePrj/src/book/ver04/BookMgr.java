package book.ver04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookMgr {
	private List<Book> bookList = new ArrayList<Book>();
	FileBook file = new FileBook();
	String fileName = "c:/file/sample1.txt";

	public BookMgr() throws FileNotFoundException {

		bookList = (List<Book>) file.read(fileName);

		if (bookList == null || bookList.size() == 0) {
			fileName = "c:/file/sample1.txt";
			Scanner s = new Scanner(new File(fileName));
			bookList = new ArrayList<Book>();
			while (s.hasNextLine()) {
				String readLine = s.nextLine();
				String[] data = readLine.split("/");
				bookList.add(new Book(data[0], Integer.parseInt(data[1].trim())));
			}
		}

		Thread job = new AutoSave();
		job.start();

	}

	/*
	 * String fileName = "c://file/sample1.txt";
	 * 
	 * try (Scanner s = new Scanner(new File(fileName))) { while
	 * (s.hasNextLine()) { String readLine = s.nextLine(); String[] data =
	 * readLine.split("/"); bookList.add(new Book(data[0],
	 * Integer.parseInt(data[1].trim()))); } }
	 */

	public void filesave() {
		file.save(bookList, fileName);
	}

	public BookMgr(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	/*
	 * public BookMgr(Book[] data) {
	 * 
	 * //for(int i=0;i<data.length;i++){ bookList.add(data[i]); }
	 * 
	 * List<Book> d = Arrays.asList(data); bookList.addAll(d);
	 * 
	 * Thread job = new AutoSave(); job.start(); }
	 */

	public void addBook(Book data) { // 도서 추가
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

	// 검색
	public void searchBookList(String title) {
		boolean fleg = false;
		System.out.println("검색 데이터 출력.");
		for (Book data : bookList) {
			if (data.getTitle().equalsIgnoreCase(title)) {
				System.out.println(data + "검색하신 도서를 찾았습니다.");
				fleg = true;
			}
		}
		if (fleg == false) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	// 삭제
	public void delete(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book book = it.next();
			if (book.getTitle().equals(title)) {
				System.out.println("도서를 삭제하였습니다. : " + book);
				it.remove();
			}
		}
	}

	// 수정
	public void update(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().trim().equals(title)) {
				System.out.println("책 제목을 변경하시려면 새로운 제목을 입력하세요.");
				System.out.println("제목 수정을 원하지 않으시면 기존의 제목을 입력해주세요.");
				Scanner s = new Scanner(System.in);
				String s1 = s.nextLine();
				System.out.println("책의 새로운 가격을 입력하세요.");
				System.out.println("가격 수정을 원하지 않으시면 기존의 가격을 입력해주세요.");
				String s2 = s.nextLine();
				bookList.get(i).setTitle(s1);
				bookList.get(i).setPrice(Integer.parseInt(s2));
				System.out.printf("%s의 정보가 수정되었습니다.%n", title);
			}			
		}

	}

	class AutoSave extends Thread {

		public void run() {
			while (true) {
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				file.save(bookList, fileName);
				System.out.println("AutoSave .... ");
			}
		}
	}
}