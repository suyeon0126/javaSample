package day12;

public class Fish extends Animal{
	String name;	
	
	public Fish() {
		super();
	}
	
	public Fish(String name) {
		super();
		this.name = name;
	}

	public Fish(String kind, String name) {
		super(kind);
		//super();
		//super.setKind(kind);
		this.name = name;
	}
	@Override
	public void breath(){
		System.out.println("아가미로 숨쉬기~!");
	}

	public void display(){
		System.out.printf("Fish[%s %s]%n", super.getKind(), name);
	}
}
