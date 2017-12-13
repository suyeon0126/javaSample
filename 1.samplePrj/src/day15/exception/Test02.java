package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		try { //checked exception
			Thread.sleep(5000); // 메인 메소드 들어오자마자 5초 멈추고 다음 메세지를 찍으란 소리.
								// try, catch 블락 처리하지않으면 못넘어감.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("START");
		String name = null; //unchecked exception
		if(name != null) System.out.println(name.toString());
		
		System.out.println("END");
	}
}
