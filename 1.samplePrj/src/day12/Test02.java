package day12;

public class Test02 {
	public static void main(String[] args) {
		Animal a = new Dog(); 
		Animal f = new Fish();
		//new Animal(); X //Animal은 미완성의 코드가 있기 때문에 new로 올릴 수 없음(객체생성 불가능). 올리려면 미완성의 코드를 완성시켜야함
		
		//Animal[] animal = new Animal[5]; //객체생성이 아니라 타입선언. Animal의 타입으로 공간을 만드는 것이기때문에 가능.
		Animal[] animals = {a, f};
		for(int i=0; i<animals.length ; i++){
			animals[i].breath();
		}
	}

}
