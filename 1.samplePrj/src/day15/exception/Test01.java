package day15.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");

		try {// 에러가 발생 한 코드를 여기에.
			System.out.println("try{");

			System.out.println(args[0].length()); // 비정상 종료 에러 발생.
			int num = Integer.parseInt(args[0]);
			System.out.println(10/num);
			System.out.println("}");

		} catch (ArrayIndexOutOfBoundsException e) { // Exception 은 모든 객체의 예외이기
														// 때문에 두루뭉실하게 처리하면 안됨.
			// someException e1 타입의 예외 객체인 e1을 받아서 처리하는 코드를 작성.
			System.out.println("접근 할 수 없는 배열 인덱스 사용..");

		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력해주세요.");
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		} catch (Exception e) { //내가 발견하지 못했던 예외발생 체크.
			System.out.println("~~~~~~~~~~");
			
		}finally {
			// try 블록을 빠져나간 뒤 항상 실행. 자원반납은 다 여기에.
			System.out.println("자원 반납은 여기에~~");
		}

		System.out.println("END"); // END가 System.out으로 찍히면 정상종료 했다는 것.

	}
}
