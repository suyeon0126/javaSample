package day17;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee<Integer> e1 = new Employee<Integer>();
		e1.number = 2017;
		// System.out.println(e1.number.charAt(e1.number.length()-1));

		Employee e2 = new Employee();

		/*
		 * Employee<Integer, Integer> e1 = new Employee(); e1.number = 2015;
		 * 
		 * Employee e3 = new Employee(); // 데이터타입을 주지않으면 Object Type으로 처리.
		 * e3.number = 2222; e3.number = "1234";
		 */

	}
}

class Employee<T> implements Comparable<T>{ // 제너릭 T안에는 Object만 사용 가능. 기본형 사용 X
	String name;
	T number;

	public Employee() {
		super();
	}

	public Employee(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		//
		this.number = number;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
