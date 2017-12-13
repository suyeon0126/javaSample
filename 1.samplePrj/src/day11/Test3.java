package day11;

import java.util.concurrent.SynchronousQueue;

public class Test3 {
	public static void main(String[] args) {
		/*내가 한 것
		System.out.println("[출력값]");
		Person a = new Student("홍길동", 20, 200201);
		a.print();
		
		a = new Teacher("이순신", 30, "JAVA");
		a.print();
		a = new Employee("유관순", 40, "교무과");
		a.print();*/
		
		//수업시간에 한 것
		Object s = new Student("길동", 20, 1);
		if(s instanceof Student)((Student)s).print();
		s="Hello";
		if(s instanceof Student)((Student)s).print(); //무조건 캐스팅하면 문제가 발생하기 때문에, instanceof로 타입체크.
		
		String name = "ooo";
		Student s1 = new Student("길동", 20, 1);
		Teacher t1 = new Teacher("홍쌤", 40, "java");
		Employee e1 = new Employee("홍길동",44, "교무실");
		
		//Object[] obj = {name, s1, t1, e1}; //object는 다 담을 수 있지만, person타입에는 String 객체가 들어갈 수 x
		Person[] p = {s1, t1, e1, new Student("고길동", 22, 2)}; 
		
		System.out.println("--------------------------------");
		for(int i = 0; i<p.length; i++){
			if(p[i] instanceof Student)((Student)p[i]).print();
			if(p[i] instanceof Teacher)((Teacher)p[i]).print();
			if(p[i] instanceof Employee)((Employee)p[i]).print();			
		}
		System.out.println("---------------------------------");
		
		for(int i=0; i<p.length; i++){
			p[i].print();
		}
		System.out.println("--------------------");
		
		Person pp = t1;
		pp.print();
		System.out.println("------------------------");
		
		Object[] obj = {name, s1, t1, e1}; //Object 타입에 집어넣은 데이터들 중 Person만 빼냄.
		for(int i=0; i<obj.length; i++){ 
			if(obj[i] instanceof Person) //name이 String이기 때문에 타입체크 꼭!
				((Person)obj[i]).print();
		}
		
}
}