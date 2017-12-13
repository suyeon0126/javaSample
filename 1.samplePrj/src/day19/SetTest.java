package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		//Set<String> set = new TreeSet<>();
		
		set.add("java 09");
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);
		set.remove("java 07");
		System.out.println(set);
		
		//��ȸ
		Iterator<String> it = set.iterator(); //String���� ����
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data.substring(data.length()-2));
		}
		
		Iterator itt = set.iterator(); //object�� ����
		while (itt.hasNext()) {
			Object data = (Object) itt.next();
			System.out.println(data); //substring�� ������ �ٿ�ĳ������ �ϰų� String�� ����ؾ���.
		}
		
		set.add("java 99");
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
	}
}
