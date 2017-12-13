package day15.inner01;

public class Test01 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A()); //어떤 주소를 쓸 건지 주소를 넘겨줘야함.
		b1.print();
	}
}

class A {
	String name = "A";
}

class B {
	A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}

	void print() {
		System.out.println(a.name);
	}

}