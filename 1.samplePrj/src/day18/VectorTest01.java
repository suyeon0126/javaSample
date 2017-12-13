package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();

		List<Student> list = new Vector<Student>(); // Vector==ArrayList
		// ���
		list.add(new Student("�浿��", 90, 99));
		list.add(new Student("��浿", 80, 99));
		list.add(new Student("��浿", 70, 99));
		list.add(new Student("�ڱ浿", 99, 99));

		System.out.println(list);

		// ��ȸ
		int delindex = -1;
		for (int i = 0; i < list.size(); i++) {
			Student data = list.get(i);
			// data.avg();
			// list.remove(i);
			// System.out.println(list.size());
			if (data.name.equals("�浿��")) {
				delindex = i;
			}
		}
		// list.remove(delindex);
		System.out.println(list);
		System.out.println("----------------------------------------");

		for (Student data : list) { // for���� ��������� ��ġ�ε����� �� �� ��� ����. list���
									// �迭�̳� collection�� �͵� �������.
			System.out.println(data);
			// data.avg();
			// list.remove(data); ��ġ�ε����� ���� ������ �����۾��� �̷����������.
		} // �� for���� ��¿����θ� ����Ѵ�. set������ ��ġ�ε����� �𸣱� ������ ���� for��.

		System.out.println(list);
		System.out.println("-------------------------------------------------");

		Iterator<Student> it = list.iterator();

		while (it.hasNext()) {
			Student data = it.next();
			data.avg();
			if (data.name.equals("�浿��")) {
				it.remove();
			}
		}
		// System.out.println(list);
		System.out.println(list.contains(new Student("��浿", 90, 99)));

		//Student[] temp = (Student[]) list.toArray();
		//Student[] temp2 = new Student[list.size()];
		//list.toArray(temp2); //list �ȿ� �ִ� �����Ͱ� temp2�� ��. output �Ķ����ó�� ��� ����.
		
		//Arrays.sort(temp2); //�迭�� ������ ���� Arrays�� ���� sort�� ���.
		
		Collections.sort(list); 
		
		for (Student data : list) { // ������ ������ ��.
			System.out.println(data);
			System.out.println("---------------------------------");

		}
	}
}

