package day16;

public class Calc {
	static Calc calc = null;
	
	public static double add(int a, double b){
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println(calc.add(666,99.99));
	}



}
