package day12;

public abstract class Animal { //추상 클래스. abstract은 상속을 전재로함.
	private String kind = "동물의 종류";

	public Animal(){
		System.out.println("Aniamal() 수행");
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public abstract void breath(); //구현부 없애고 abstract.
}
