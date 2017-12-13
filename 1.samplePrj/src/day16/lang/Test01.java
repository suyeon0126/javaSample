package day16.lang;

public class Test01 {
	public static void main(String[] args) {
		Point p = new Point(1, 1);
		System.out.println(p);
		p.close();
		p = null; // 다 쓴 객체는 null사인을 해줘야만 gc의 대상이 됨.

		// System.gc(); //언제 수행될 지 예측 불가능해서 자바에서는 final을 안씀.

		System.out.println("main end");

	}
}

class Point implements Cloneable{
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}

	@Override
	protected void finalize() throws Throwable { // C언어에서의 소멸자 역할을 함.
		super.finalize();
		System.out.println(getClass().getSimpleName() + "finalize() 수행");
		System.out.println("자원반납코드");
	}

	void close() {
		System.out.println(getClass().getSimpleName() + "finalize() 수행");
	}

	@Override
	protected Point clone() {
		Point obj = null;
		try {
			obj = (Point) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}