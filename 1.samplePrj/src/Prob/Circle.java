package Prob;

public class Circle extends Shape {
	private double radius;			
	
	public Circle() {
		super();
	}	

	public Circle(double radius) {
		super();
		this.radius = radius;
	}	
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}	


	@Override
	public void calculationArea() {
		super.setArea(radius*radius*Math.PI);
	}
	
	public void print(){
		System.out.printf("%s의 면적은 %.13f %n", super.getName(), super.getArea());
	}

}
