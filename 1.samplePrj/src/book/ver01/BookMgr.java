package book.ver01;

public class BookMgr {
	private Book[] bookList = new Book[100]; //아주 중요한 데이터이기 떄문에 히든으로 막는것.
	private int count = 0;

	public BookMgr() {
	}

	public BookMgr(Book[] data) {
		System.arraycopy(data, 0, bookList, count, data.length);
		count = count + data.length;
	}

	public void addBook(Book data) {
		bookList[count] = data;
		count++;
	}

	public void printBookList() {
		for (int i = 0; i < count; i++) {
			bookList[i].display();
		}
	}

	public void printTitleList() {
		for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle());
		}
	}

	// 검색 기능 추가
	public void searchBookList(String title) {
		int c = 0;
		System.out.println("검색 데이터 출력.");
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				bookList[i].display();
				c++;
			}			
		}
		if(c==0){
			System.out.println("요청한 도서가 없습니다.");
		}
	}
	
	//삭제 기능 추가.
	public void delete(String title){
		for(int i=0; i<count ; i++){
			if(bookList[i].getTitle().equals(title)){
				System.out.print("삭제합니다.");
				bookList[i].display();
				System.out.println(bookList[i]+"삭제 데이터"); 
				System.arraycopy(bookList, i+1, bookList, i, count-i);
				count--;
				break;
			}
		}
	//과제시간에 해야할 것.	
	//수정(업데이트) 기능 추가. 가격 수정할때는 set메소드로!
	//검색 대소문자 구분 기능 추가.
	}
}
