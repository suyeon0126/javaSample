package day12;

public class P352 {
	public static void main(String[] args) {
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
		
	}
}


class SingleTone {
	private static SingleTone s = new SingleTone(); //내 자신의 객체생성 가능.
	private SingleTone(){
		System.out.println("SingleTone() 생성");
	}
	public static SingleTone getInstance(){
		return s;
	}
}