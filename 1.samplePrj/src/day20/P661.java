package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class P661 {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("dbinfo.txt"));
			String url = p.getProperty("url");
			String driver = p.getProperty("driver");
			String user = p.getProperty("user");
			String pw = p.getProperty("pw");
			
			System.out.println(url);
			System.out.println(driver);
			System.out.println(user);
			System.out.println(pw);
			
			System.out.println("------------------------------");
			//xml�� ����
			p.storeToXML(new FileOutputStream("data.xml"), "DB info");
			System.out.println("dbinfo ������ data.xml�� ����Ǿ����ϴ�.");
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		System.out.println(p);
		System.out.println("main END");

	}
}
