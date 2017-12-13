package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob1 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		// Set<String> strs = stringSplit(str, "#");
		// System.out.println("=== 문자열 처리 결과 ===");

		Set<String> list = stringSplit(str, "#");
		System.out.println(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
		}		
	}

	private static Set<String> stringSplit(String str, String string) {
		Set<String> set = new HashSet<>();
		int p = -1;

		// p = str.indexOf("#");
		// set.add(str.substring(0, p));
		// set.add(str.substring(p + 1, str.indexOf("#", p + 1)));

		return set;
	}
}
