package book.ver01;

public class BookMgr {
	private Book[] bookList = new Book[100]; //���� �߿��� �������̱� ������ �������� ���°�.
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

	// �˻� ��� �߰�
	public void searchBookList(String title) {
		int c = 0;
		System.out.println("�˻� ������ ���.");
		for (int i = 0; i < count; i++) {
			if (bookList[i].getTitle().equals(title)) {
				bookList[i].display();
				c++;
			}			
		}
		if(c==0){
			System.out.println("��û�� ������ �����ϴ�.");
		}
	}
	
	//���� ��� �߰�.
	public void delete(String title){
		for(int i=0; i<count ; i++){
			if(bookList[i].getTitle().equals(title)){
				System.out.print("�����մϴ�.");
				bookList[i].display();
				System.out.println(bookList[i]+"���� ������"); 
				System.arraycopy(bookList, i+1, bookList, i, count-i);
				count--;
				break;
			}
		}
	//�����ð��� �ؾ��� ��.	
	//����(������Ʈ) ��� �߰�. ���� �����Ҷ��� set�޼ҵ��!
	//�˻� ��ҹ��� ���� ��� �߰�.
	}
}
