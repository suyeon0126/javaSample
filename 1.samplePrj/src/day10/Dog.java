package day10;

public class Dog extends Animal{
	String name;
	String kind = "강아지 종류";
	public void bike(){
		System.out.println("bike~~~");
	}
	
	public void display(){
		System.out.printf("Dog[%s, %s, %s]%n", kind, this.kind, this.name);
	}//super. 하게되면 :나의 부모 라는 소리임! static 영역에서는 사용할 수 없음.


}
