package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		try { //checked exception
			Thread.sleep(5000); // ���� �޼ҵ� �����ڸ��� 5�� ���߰� ���� �޼����� ������ �Ҹ�.
								// try, catch ��� ó������������ ���Ѿ.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");
		String name = null; //unchecked exception
		if(name != null) System.out.println(name.toString());
		
		System.out.println("END");
	}
}
