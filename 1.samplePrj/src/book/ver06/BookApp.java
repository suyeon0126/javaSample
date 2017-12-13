package book.ver06;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		ArrayList<Book> data = new ArrayList<Book>();				
		data.add(new Book("Serblet", 500));
		data.add(new Book("자바프로그래밍", 900));
		data.add(new Book("SQL", 700));
				
		BookMgr bm = null; // bm이 도서목록 뿌리기 담당.
		
		try {
			bm = new BookMgr();
		} catch (FileNotFoundException e) {
			bm = new BookMgr(data);
		}
		
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;

		// 메뉴구성
		while (true) {
			System.out.println("-----도서 정보 프로그램-----");
			System.out.println("1. 도서 목록 보기.");
			System.out.println("2. 도서 등록.");
			System.out.println("3. 도서 삭제.");
			System.out.println("4. 도서 검색.");
			System.out.println("5. 도서 수정.");
			System.out.println("6. 저    장. ");
			System.out.println("7. 프로그램 종료.");
			System.out.println("----------------------");
			System.out.println("원하는 작업을 입력하세요.");
			cmd = Integer.parseInt(scanner.nextLine().trim());
			switch (cmd) {
			case 1:
				bm.printBookList();
				break;
			case 2:
				System.out.print("등록할 책의 제목을 입력하세요.");
				String title = scanner.nextLine();
				System.out.println("등록할 책의 가격을 입력하세요.");
				int price = scanner.nextInt(); // ☆★
				scanner.nextLine();
				Book data1 = new Book(title, price);
				bm.addBook(data1);
				// bm.printBookList();
				System.out.println("등록된 도서정보는 다음과 같습니다.");
				bm.searchBookList(title);
				break;
			case 3:
				System.out.println("삭제 작업 수행.");
				System.out.println("삭제할 도서명을 입력하세요.");
				String title1 = scanner.nextLine();
				bm.delete(title1);
				break;
			case 4:
				System.out.println("도서 검색 기능을 수행합니다.");
				System.out.println("검색할 도서명을 입력하세요.");
				String title2 = scanner.nextLine();
				bm.searchBookList(title2);
				break;
			case 5:
				System.out.println("도서 수정 기능을 수행합니다.");
				System.out.println("수정을 원하는 책의 제목을 입력하세요.");
				String title3 = scanner.nextLine();
				bm.update(title3);
				break;
			case 6:
				System.out.println("도서 목록을 파일에 저장합니다.");
				bm.filesave();							
				break;
			case 7:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0); // 프로그램을 종료해줌.
			default:
				System.out.println("다시 선택해주세요.");
				break;				
			}			
		}
	}

}
