package day16.exception;

import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("sample2.txt");) { // 자동으로
																			// 자원반납해줌.
			// Closeable를 implements한 것만 try() 안에 들어 갈 수 있음.
			System.out.println("작업처리"); //
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("sample3.txt 문서를 준비하세요.");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			System.out.println("finally{} 수행");
		}

		System.out.println("----------------------------");
		try (Scanner scanner = new Scanner(new File("sample2.txt"));) {
			Account a = new Account("", -400);

		} catch (FileNotFoundException e) {
			System.out.println("sample2.txt 파일을 준비해주세요..");

		} catch (MoneyException e) {
			System.out.println(e.getMessage());
		
		} catch (Exception e) {
			e.printStackTrace();
		
		} finally {
			
		}

		System.out.println("main END");
	}
}
