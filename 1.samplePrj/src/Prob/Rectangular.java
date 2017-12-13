package Prob;

public class Rectangular extends Shape {
	private double width;
	private double hight;		

	public Rectangular() {
		super();
	}	

	public Rectangular(double width, double hight) {
		super();
		this.width = width;
		this.hight = hight;
	}
	
	public Rectangular(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}


	@Override
	public void calculationArea() {
		super.setArea(width*hight);		
	}
	
	public void print(){
		System.out.printf("%s의 면적은 %.1f %n", super.getName(), super.getArea());
	}

}
