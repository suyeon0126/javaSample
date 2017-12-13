package day13.Prob;

public class ShapeTest {
	public static void main(String[] args) {
		//수업
		Shape[] shapes = {
				new Rectangle(5,6),
				new RectTriangle(6,2)
		};
		
		for(int i=0; i<shapes.length; i++){
			System.out.println("area: "+shapes[i].getArea());			
			if(shapes[i] instanceof Resizable){
			((Resizable)shapes[i]).resize(0.5);
			System.out.println("new area: "+shapes[i].getArea());
			}
		}
		
		
		
		/* 내가 제출한 것.
		Rectangle rt = new Rectangle(5,6);
		RectTriangle rt2 = new RectTriangle(6,2);

		Shape[] s = { rt, rt2 };
		for (int i = 0; i < s.length; i++) {
			System.out.println("area : "+ s[i].getArea());
			if(s[i] instanceof Resizable){
				 ((Resizable)s[i]).resize(0.5);
				 System.out.println("new area : "+s[i].getArea());
			}
		}*/
	}
}
