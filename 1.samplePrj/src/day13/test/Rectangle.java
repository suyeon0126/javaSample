package day13.test;

public class Rectangle extends Shape implements colorable, Drawable {

	@Override
	public void draw() {		
		System.out.println(getClass().getSimpleName() +" ������ ����մϴ�.");
	}

	@Override
	public void drawColor() {		
		System.out.println(getClass().getSimpleName() +" �׸���");
	}

	@Override
	public void calculationArea() {		
		System.out.println(getClass().getSimpleName() +" ��ĥ�ϱ�");
	}

}
