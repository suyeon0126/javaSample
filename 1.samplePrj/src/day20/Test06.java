package day20;

public class Test06 {
	public static void main(String[] args) {
		F1 f = new F1() { // 익명 클래스를 이용한 구조.
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
		};

		System.out.println(f.max(44, 99));

		F1 f2 = (int a, int b) -> {// 람다식으로 구현.
			return a > b ? a : b;
		};
		System.out.println(f2.max(4, 9));

		F2 f3 = (int a, int b) -> {
			return a < b ? a : b;
		};
		System.out.println(f3.min(10, 5));

	}
}

@FunctionalInterface // 변수에 등록할 함수가 꼭 하나는 있어야함. 람다식으로 표현 가능하다는걸 알려주기위해 표기.
interface F1 {
	int max(int a, int b);
}

interface F2 {
	int min(int a, int b);
}
