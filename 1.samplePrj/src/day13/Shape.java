package day13;

public class Shape {
	private String color;

	public Shape() {	}
	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println(color + " »öÄ¥ÇÏ±â");
	}

	@Override
	public String toString() {
		return "Shape [color=" + color + "]";
	}

}
