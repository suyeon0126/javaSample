package day12;

public class StudentTest2 {
	public static void main(String[] args) {
		String name = new String("java Test~!");
		String name2 = new String("java Test~!");
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date == date2);
		System.out.println(date.equals(date2));
	

		Student s = new Student("ȫ�浿", 22, 1);
		Student s2 = new Student("ȫ�浿", 22, 2);
		System.out.println(s == s2);
		System.out.println(s.equals(s2));
		System.out.println(s.equals(date));
		String s3 = null;
		System.out.println(s.equals(null));
		
		
	}

}
