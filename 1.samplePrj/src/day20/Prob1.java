package day20;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		/*
		 * Vector<String> moveToVector(String datas[]) - ��Ʈ�� �迭�� �ִ� �����͸� Vector��
		 * ��ȯ�ϴ� ���α׷��� �ۼ��Ѵ�.
		 */
		String[] s = { "5", "4", "3", "2", "1" };
		Prob1 p = new Prob1();
		Vector<String> v = p.moveToVector(s);
		System.out.println(v);
	}

	Vector<String> moveToVector(String datas[]) {

		Vector<String> vector = new Vector<String>();

		for (int i = datas.length - 1; i >= 0; i--) {
			vector.add(datas[i]);
		}
		return vector;
	}

}
