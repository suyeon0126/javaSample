package day20;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		/*
		 * Vector<String> moveToVector(String datas[]) - 스트링 배열에 있는 데이터를 Vector로
		 * 변환하는 프로그램을 작성한다.
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
