package day12;

public class Test02 {
	public static void main(String[] args) {
		Animal a = new Dog(); 
		Animal f = new Fish();
		//new Animal(); X //Animal�� �̿ϼ��� �ڵ尡 �ֱ� ������ new�� �ø� �� ����(��ü���� �Ұ���). �ø����� �̿ϼ��� �ڵ带 �ϼ����Ѿ���
		
		//Animal[] animal = new Animal[5]; //��ü������ �ƴ϶� Ÿ�Լ���. Animal�� Ÿ������ ������ ����� ���̱⶧���� ����.
		Animal[] animals = {a, f};
		for(int i=0; i<animals.length ; i++){
			animals[i].breath();
		}
	}

}
