package day20;

public class Test06 {
	public static void main(String[] args) {
		F1 f = new F1() { // �͸� Ŭ������ �̿��� ����.
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		System.out.println(f.max(44, 99));

		F1 f2 = (int a, int b) -> {// ���ٽ����� ����.
			return a > b ? a : b;
		};
		System.out.println(f2.max(4, 9));

		F2 f3 = (int a, int b) -> {
			return a < b ? a : b;
		};
		System.out.println(f3.min(10, 5));

	}
}

@FunctionalInterface // ������ ����� �Լ��� �� �ϳ��� �־����. ���ٽ����� ǥ�� �����ϴٴ°� �˷��ֱ����� ǥ��.
interface F1 {
	int max(int a, int b);
}

interface F2 {
	int min(int a, int b);
}
