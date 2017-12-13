package day20.prob;

import java.util.Vector;

import day12.Student;

public class Prob2Test {
	public static void main(String[] args) {
		Student s = new Student("ȫ", 24, 001);
		Vector<Integer> i = new Vector<>();
		i.add(55);
		i.add(155);
		i.add(455);
		
		
		Prob2 p = new Prob2(s, i);
		p.print();
		System.out.println(p.sum());
	}

}
