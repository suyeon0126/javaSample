package day11;

import java.util.concurrent.SynchronousQueue;

public class Test3 {
	public static void main(String[] args) {
		/*���� �� ��
		System.out.println("[��°�]");
		Person a = new Student("ȫ�浿", 20, 200201);
		a.print();
		
		a = new Teacher("�̼���", 30, "JAVA");
		a.print();
		a = new Employee("������", 40, "������");
		a.print();*/
		
		//�����ð��� �� ��
		Object s = new Student("�浿", 20, 1);
		if(s instanceof Student)((Student)s).print();
		s="Hello";
		if(s instanceof Student)((Student)s).print(); //������ ĳ�����ϸ� ������ �߻��ϱ� ������, instanceof�� Ÿ��üũ.
		
		String name = "ooo";
		Student s1 = new Student("�浿", 20, 1);
		Teacher t1 = new Teacher("ȫ��", 40, "java");
		Employee e1 = new Employee("ȫ�浿",44, "������");
		
		//Object[] obj = {name, s1, t1, e1}; //object�� �� ���� �� ������, personŸ�Կ��� String ��ü�� �� �� x
		Person[] p = {s1, t1, e1, new Student("��浿", 22, 2)}; 
		
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
		
		Object[] obj = {name, s1, t1, e1}; //Object Ÿ�Կ� ������� �����͵� �� Person�� ����.
		for(int i=0; i<obj.length; i++){ 
			if(obj[i] instanceof Person) //name�� String�̱� ������ Ÿ��üũ ��!
				((Person)obj[i]).print();
		}
		
}
}