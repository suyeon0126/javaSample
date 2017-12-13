package day13.Prob;

public class Rectangle extends Shape implements Resizable {
	double width;
	double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super(4);
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double s) {
		width = width*s;
		height = height*s;		
	}

	@Override
	public double getArea() {
		return width*height;
	}

}
