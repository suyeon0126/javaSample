package day15.inner02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();//이너클래스는 아우터클래스를 사용하기 위해서는 주소가 필요함. 이너클래스 B의 타입. B라고 쓰면 에러남.
		b.print(); //이너클래스는 아우터클래스의 자원을 마음껏 사용할 수 있음.
		
		new A().pp(); 
		
		A.S s = new A.S(); //static한 자원은 클래스 네임으로 접근.
		s.print();
	}
}

class A { //아우터 클래스는 필요하면 이너클래스 사용 가능.
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
			//System.out.println(name); //static은 A의 인스턴스 자원 사용 불가능.
			System.out.println("~~~~~~~~~");
		}
	}
}
