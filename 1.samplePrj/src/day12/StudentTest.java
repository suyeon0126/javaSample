package day12;

public class StudentTest {
	public static void main(String[] args) {
		String name = new String("java Test~!");
		String name2 = new String("java Test~!");
		System.out.println(name);
		System.out.println(name.toString());
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date);
		System.out.println(date.toString());
	

		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);
		System.out.println(s); // 주소가 찍히는 이유는 toString override 하지 않았기 때문.
		System.out.println(s.toString());
		
		
	}

}
