package day13.test;

public class Circle extends Shape implements Drawable, colorable {

	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName() +" ������ ����մϴ�.");		
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() +" �׸���");		
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName() +" ��ĥ�ϱ�");
	}
	

}