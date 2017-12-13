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

	// 검색 기능 추가
	public void searchBookList(String title) {
		int i;
		boolean fleg = false;
		System.out.println("검색 데이터 출력.");
		for (i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				bookList.get(i).display();
				fleg = true;
			}
		}
		if (fleg == false) {
			System.out.println("요청한 도서가 없습니다.");
		}
	}

	// 삭제 기능 추가.
	public void delete(String title) { //Iterator로 수정.
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.print("삭제합니다.");
				bookList.get(i).display();
				System.out.println(bookList.get(i) + "삭제 데이터");
				bookList.remove(i);
				break;
			}
		}
	}

	// 수정 기능 추가.
	public void update(String title) {
		for (int i = 0; i < bookList.size(); i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.println("책의 제목과 가격을 수정합니다.");
				Scanner s = new Scanner(System.in);
				String s1 = s.nextLine();
				System.out.println("수정할 책의 새로운 가격을 입력하세요.");
				String s2 = s.nextLine();
				bookList.get(i).setTitle(s1);
				bookList.get(i).setPrice(Integer.parseInt(s2));
				System.out.printf("%s의 정보가 수정되었습니다.%n", title);
			}
		}
		
	}
}

// 과제시간에 또 추가할 것. 검색 대소문자 구분 기능 추가.
