package day15.inner02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();//�̳�Ŭ������ �ƿ���Ŭ������ ����ϱ� ���ؼ��� �ּҰ� �ʿ���. �̳�Ŭ���� B�� Ÿ��. B��� ���� ������.
		b.print(); //�̳�Ŭ������ �ƿ���Ŭ������ �ڿ��� ������ ����� �� ����.
		
		new A().pp(); 
		
		A.S s = new A.S(); //static�� �ڿ��� Ŭ���� �������� ����.
		s.print();
	}
}

class A { //�ƿ��� Ŭ������ �ʿ��ϸ� �̳�Ŭ���� ��� ����.
	String name = "A";
	
	void pp(){
		new B().print();
	}

	class B {
		void print() {
			System.out.println(name);
		}
	} 
	
	static class S {
		void print() {
			//System.out.println(name); //static�� A�� �ν��Ͻ� �ڿ� ��� �Ұ���.
			System.out.println("~~~~~~~~~");
		}
	}
}
