package Prob;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
		super();
	}

	public Shape(double area, String name) {
		super();
		this.area = area;
		this.name = name;
	}
	
	public Shape(String name){
		this.name = name;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public abstract void calculationArea();
	
	
	public void print(){
		System.out.printf("%s의 면적은 %f %n", name, area);
		
	}
	
	@Override
	public String toString() {	
		StringBuilder sb = new StringBuilder();
		sb.append("Shape[");
		sb.append(name);
		sb.append(",");
		sb.append(area);
		sb.append("]");		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Shape){
			if(!((Shape)obj).name.equals(name)){
				return false;
			}
			if(((Shape)obj).area != this.area){
				return false;
			}
			return true;
		}
		return false;
	}
}
