package day13.test;

public class Test01 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculationArea();
		c.draw();
		c.drawColor();
		Shape s = c;
		s.calculationArea();
		System.out.println(c);
		System.out.println(s);
		Drawable d = c;
		d.draw();
		
		Shape[] ss = {
			new Circle(),
			new Rectangle()
		};
		
		for(int i=0; i<ss.length; i++){
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();
			((colorable)ss[i]).drawColor();
		}
	}
}
