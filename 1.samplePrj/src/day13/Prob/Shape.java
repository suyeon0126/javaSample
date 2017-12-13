package day13.Prob;

public abstract class Shape {
	int numSides; // ���� ��

	public Shape() {
		super();
	}

	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public abstract double getArea(); // ����

	@Override
	public String toString() {
		return "Shape [numSides=" + numSides + "]";
	}

}
