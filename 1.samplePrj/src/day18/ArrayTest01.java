package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();

		List<Student> list = new ArrayList<Student>(); // Vector==ArrayList
		// 등록
		list.add(new Student("길동이", 90, 99));
		list.add(new Student("김길동", 80, 99));
		list.add(new Student("고길동", 70, 99));
		list.add(new Student("박길동", 99, 99));

		System.out.println(list);

		// 순회
		int delindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Student data = list.get(i);
			// data.avg();
			// list.remove(i);
			// System.out.println(list.size());
			if (data.name.equals("길동이")) {
				delindex = i;
			}
		}
		// list.remove(delindex);
		System.out.println(list);
		System.out.println("----------------------------------------");

		for (Student data : list) { // for문을 쓰고싶은데 위치인덱스를 모를 때 사용 가능. list대신
									// 배열이나 collection이 와도 상관없음.
			System.out.println(data);
			// data.avg();
			// list.remove(data); 위치인덱스를 몰라서 생각한 삭제작업이 이루어지지않음.
		} // 이 for문은 출력용으로만 사용한다. set구조에 위치인덱스를 모르기 때문에 나온 for문.

		System.out.println(list);
		System.out.println("-------------------------------------------------");

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student data = it.next();
			data.avg();
			if (data.name.equals("길동이")) {
				it.remove();
			}
		}
		// System.out.println(list);
		System.out.println(list.contains(new Student("고길동", 90, 99)));

		//Student[] temp = (Student[]) list.toArray(); //오류발생.
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2); //list 안에 있는 데이터가 temp2에 들어감. output 파라미터처럼 사용 가능.
		
		Arrays.sort(temp2); //배열을 정렬할 때는 Arrays가 가진 sort를 사용.
		
		Collections.sort(list); 
		
		for (Student data : list) { // 밑으로 정렬할 것.
			System.out.println(data);
			System.out.println("---------------------------------");

		}
	}
}

class Student implements Comparable<Student> {
	String name;
	int ko;
	int math;
	int avg;

	public Student() {
		super();
	}

	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}

	public void avg() {
		avg = (ko + math) / 2;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) { // equals메서드가 없으면 비교할 능력이 사라짐.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Student o) {
		return o.avg - avg;
		//return name.compareTo(o.name); //이름순으로 나열.
	}

}// 1. 인캡슐레이션. 2. 생성자메소드. 3. equals메소드.