package day15.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");

		try {// ������ �߻� �� �ڵ带 ���⿡.
			System.out.println("try{");

			System.out.println(args[0].length()); // ������ ���� ���� �߻�.
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");

		} catch (ArrayIndexOutOfBoundsException e) { // Exception �� ��� ��ü�� �����̱�
														// ������ �η繶���ϰ� ó���ϸ� �ȵ�.
			// someException e1 Ÿ���� ���� ��ü�� e1�� �޾Ƽ� ó���ϴ� �ڵ带 �ۼ�.
			System.out.println("���� �� �� ���� �迭 �ε��� ���..");

		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �Է����ּ���.");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (Exception e) { //���� �߰����� ���ߴ� ���ܹ߻� üũ.
			System.out.println("~~~~~~~~~~");
			
		}finally {
			// try ����� �������� �� �׻� ����. �ڿ��ݳ��� �� ���⿡.
			System.out.println("�ڿ� �ݳ��� ���⿡~~");
		}

		System.out.println("END"); // END�� System.out���� ������ �������� �ߴٴ� ��.

	}
}
