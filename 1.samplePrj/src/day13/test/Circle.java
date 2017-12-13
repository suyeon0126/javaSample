package day13.test;

public class Circle extends Shape implements Drawable, colorable {

	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName() +" 면적을 계산합니다.");		
	}

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName() +" 그리기");		
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName() +" 색칠하기");
	}
	

}
