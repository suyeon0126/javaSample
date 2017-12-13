package day13.Prob;

public class RectTriangle extends Shape {
	double width;
	double height;

	public RectTriangle() {
		super();
	}

	public RectTriangle(double width, double height) {
		super(3);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width*height/2;
	}

}
