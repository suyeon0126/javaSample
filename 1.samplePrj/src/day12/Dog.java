package day12;

public class Dog extends Animal{
	String kind = "������ ����";
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
	public void breath(){ //�������̵�. Animal�� �������ִ� �߻�޼ҵ带 �����ؾ��ϱ� ������ �θ��� ������ �״�� �����ͼ� �ٲ�.
		System.out.println("��� ������");
	}

}
