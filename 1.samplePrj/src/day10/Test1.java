package day10;

public class Test1 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("-----------------------");
		Dog d = new Dog();
		d.display();
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind); //강아지종류
		System.out.println(((Animal)d).kind); //동물의 종류
		System.out.println("-----------------------------------");
		//is A 관계 : 모든 객체의 Data Type은 부모가 될 수 있다.
		Animal e = new Dog();
		e.breath();
		((Dog)e).bike(); //e 타입으로는 자식영역의 자원에 접근 할 수 없음. 지금은 다운캐스팅 한것.(핸들링 불가능)
		System.out.println(e.kind);
		
		//오버라이딩 메소드:부모로한테 물려받은 자원을 자식한테 적합하게 바꾸는 것. 
		
	}
}

