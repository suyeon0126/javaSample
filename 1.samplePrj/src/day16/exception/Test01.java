package day16.exception;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main START");
		
		String name = null;
		if(name != null && name.length() > 0)
			System.out.println(name.charAt(0));
		
		
		try {
			Class.forName("day16.exception.Sample");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("클래스 이름 확인 필요");
		}
	
		
		System.out.println("main END");
		

	}
}

class Sample{
	
}