package day11;

public class Employee extends Person {
	private String dept;
		
	public Employee() {
		super();
	}

	public Employee(String name, int age, String dept) {
		super(name, age);		
		this.dept = dept;
	}
	
	public void print(){
		System.out.printf("�̸� : %s  ���� : %d  �μ� : %s %n", super.getName(), super.getAge(), dept);
	}
	
	

}
