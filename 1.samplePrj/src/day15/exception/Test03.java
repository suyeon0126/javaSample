package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("START");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("sample2.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} finally { //자원반납 할 때에도 필요하면 try-catch 블락을 사용해야함.
			try {
				if(fis != null) fis.close(); //null일때는 반납할 자원이 없음. null이 아닐때만 자원 반납해.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("END");
	}
}
