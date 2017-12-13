package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		Map<String, Student> map = new HashMap<>();

		Student[] s = {
			new Student("2017009", "고", 90, 88),
			new Student("2017001", "김", 90, 100),
			new Student("2017003", "도", 70, 80),
			new Student("2017009", "장", 90, 98),
			new Student("2017021", "김", 100, 95),
			new Student("2017005", "변", 95, 88),
			new Student("2017007", "박", 75, 99)
		};
		
		for(int i=0; i<s.length ; i++){
			map.put(s[i].getNum(), s[i]);
		}
		
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String num = (String) it.next();
			System.out.println(map.get(num));
		}
		
		
		
	}
}

class Student {
	String num; // 학번. 중복X
	String name;
	int ko, math, avg;

	public Student() {
	}

	public Student(String num, String name, int ko, int math) {
		this.num = num;
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	public String getNum() {
		return num;
	}

	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", avg=" + avg + "]";
	}
	
	

}