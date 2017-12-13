package day12;

public abstract class Animal { //�߻� Ŭ����. abstract�� ����� �������.
	private String kind = "������ ����";

	public Animal(){
		System.out.println("Aniamal() ����");
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

	public abstract void breath(); //������ ���ְ� abstract.
}
