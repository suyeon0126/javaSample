package day12;

public class Dog extends Animal{
	String kind = "강아지 종류";
	String name;
	
	public Dog() {
		super();
	}

	public Dog(String kind, String name) {
		//super();
		this.kind = kind;
		this.name = name;
	}
	public Dog(String superk, String kind, String name) {
		super(superk);
		this.kind = kind;
		this.name = name;
	}
	
	public void display(){
		System.out.printf("Dog[%s %s %s]%n", super.getKind(),kind, name);
	}
	@Override
	public void breath(){ //오버라이딩. Animal이 가지고있는 추상메소드를 구현해야하기 때문에 부모의 조건을 그대로 가져와서 바꿈.
		System.out.println("폐로 숨쉬기");
	}

}
