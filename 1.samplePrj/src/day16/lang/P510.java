package day16.lang;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		String filename = "sample2.txt"; // args[0]ó���� ����.
		try (Scanner scanner = new Scanner(new File(filename));) {

			while (scanner.hasNextLine()) {
				String data = scanner.nextLine();
				// System.out.println(data);
				int sum = 0;
				String[] datas = data.split("/");

				for (int i = 1; i < datas.length; i++) {
					sum += Integer.parseInt(datas[i].trim());
				}
				System.out.printf("�̸� : %s, ���� : %d, ��� : %5.2f %n", datas[0], sum, sum / 3.0);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}

		System.out.println("Main END");
	}
}
