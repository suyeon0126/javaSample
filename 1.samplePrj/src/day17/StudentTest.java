package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[100];
		int count = 0;

		try (Scanner scanner = new Scanner(new File("studentdata.txt"))) {
			while (scanner.hasNextLine()) {
				String readLine = scanner.nextLine(); // readLine = �� ��.
				String[] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));
				count++;
			}

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("studentdata.txt ������ �غ��ϼ���.");
			} else {
				e.printStackTrace();
			}
		} finally {
		}

		// System.out.println(Arrays.toString(students));

		try {
			Arrays.sort(students, 0, count);

		} catch (ClassCastException e) {
			System.out.println("���� ����Ű ������ �ʿ��մϴ�.");
		}

		for (int i = 0; i < count; i++) {
			System.out.println(students[i]);
			System.out.println("------------------------------------");
		}
		String[] i = { "j", "a", "f" };
		Arrays.sort(i);
		System.out.println(Arrays.toString(i)); // String[]������ �ƹ� �������� sort��
												// �̷����.

		System.out.println(" --- main end --- ");
	}
}

class Student implements Comparable<Student> {
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		// return age - o.age ; //����Ű�� age �� ���� �� �������� ����.
		// return name.compareTo(o.name);
		/*if (name.compareTo(o.name) == 0) {
			return age - o.age;
		} else {
			return name.compareTo(o.name);
		} //��������� if������ �̸��� ���� �� ���̼����� ����.*/
		
		int result = name.compareTo(o.name);
		return (result != 0)? result:age - o.age ; //���׿����ڷ� �̸��� ���� �� ���̼����� ����.
	}

}