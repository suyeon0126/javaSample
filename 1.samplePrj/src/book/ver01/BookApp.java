package book.ver01;

import java.util.Scanner;

public class BookApp {
	public static void main(String[] args) {
		Book[] data = { 
				new Book("Serblet", 500), 
				new Book("�ڹ����α׷���", 900), 
				new Book("SQL", 700) 
				};
		BookMgr bm = new BookMgr(data); // bm�� ������� �Ѹ��� ���.
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;

		// �޴�����
		while (true) {
			System.out.println("-----���� ���� ���α׷�-----");
			System.out.println("1. ���� ��� ����.");
			System.out.println("2. ���� ���.");
			System.out.println("3. ���� ����.");
			System.out.println("4. ���� �˻�.");
			System.out.println("5. ���α׷� ����.");
			System.out.println("----------------------");
			System.out.println("���ϴ� �۾��� �Է��ϼ���.");
			cmd = Integer.parseInt(scanner.nextLine().trim());
			switch (cmd) {
			case 1:
				bm.printBookList();
				break;
			case 2:
				System.out.print("����� å�� ������ �Է��ϼ���.");
				String title = scanner.nextLine();
				System.out.println("����� å�� ������ �Է��ϼ���.");
				int price = scanner.nextInt(); // �١�
				scanner.nextLine();
				Book data1 = new Book(title, price);
				bm.addBook(data1);
				// bm.printBookList();
				System.out.println("��ϵ� ���������� ������ �����ϴ�.");
				bm.searchBookList(title);
				break;
			case 3:
				System.out.println("���� �۾� ����.");
				System.out.println("������ �������� �Է��ϼ���.");
				String title1 = scanner.nextLine();
				bm.delete(title1);
				break;
			case 4:
				System.out.println("���� �˻� ����� �����մϴ�.");
				System.out.println("�˻��� �������� �Է��ϼ���.");
				String title2 = scanner.nextLine();
				bm.searchBookList(title2);
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0); // ���α׷��� ��������.
			default:
				System.out.println("�ٽ� �������ּ���.");
				break;				
			}			
		}
	}

}