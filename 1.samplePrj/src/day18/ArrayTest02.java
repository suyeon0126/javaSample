package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {
	public static void main(String[] args) {
		// Employee[] emp = new Employee[100];
		List<Employee> list = new ArrayList<Employee>();
		// 등록
		list.add(new Employee("007", "홍길동", "기술부"));
		list.add(new Employee("008", "고길동", "기획부"));
		list.add(new Employee("001", "김길동", "영업부"));
		list.add(new Employee("006", "최길동", "회계부"));
		list.add(new Employee("003", "박길동", "기술부"));

		// 정렬 후 출력
		Collections.sort(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("-----------------------------------------------");
		// 삭제
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			if (data.getNum().equals("006")) {
				System.out.println(data + " : 사원 정보를 삭제합니다.");
				it.remove();
			}
		}
		System.out.println("----------------- 현재 사원 목록 --------------------");
		for (Employee data : list) {
			System.out.println(data);
		}
		System.out.println("------------------------------------------------");
		// 검색
		System.out.println("이름이 홍씨인 사원 목록 검색.");
		for (Employee data : list) {
			if (data.getName().charAt(0) == '홍') {
				System.out.println(data + " : 검색 되었습니다.");
			}
		}
		System.out.println("-------------------------------------------------");
		
		Employee[] data = new Employee[list.size()];
		System.out.println(Arrays.toString(data));
		list.toArray(data);
		System.out.println(Arrays.toString(data));
		System.out.println("---------------------------------");
		
		for(Employee data1 :list){
			System.out.println(data1);
			System.out.println("---------------------");
		}
		
	}
}

class Employee extends Object implements Comparable<Employee> { // ArrayList보다
																// class를 더 잘
																// 만들어야함.
	String num; // 사번
	String name; // 이름
	String dept; // 근무부서

	public Employee() {
	}

	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num); // 오름차순으로 순서 나열.
	}

}