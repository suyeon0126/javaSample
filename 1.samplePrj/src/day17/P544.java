package day17;

import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class P544 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		System.out.printf("%s, %s, %d, %f %n", name, "___", 90, 5.5);
		
		String msg = String.format("%s, %s, %d, %f %n", name, "___", 90, 5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);
		
		Date d = new Date(2017, 11, 21);
		System.out.println(d);
		System.out.println(d.getYear());
		System.out.println("----------------------");
	
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR)); //���� 0~11���� ����.
		//c.set(1016, 11, 22);
		//System.out.println(c);
		
		df = String.format("%tY�� %tm�� %te�� %ta %n", c, c, c, c);
		System.out.println(df);
		df = String.format("%1$tY�� %1$tm�� %1$te�� %1$ta���� %n", c);
		System.out.println(df);
	}
}
