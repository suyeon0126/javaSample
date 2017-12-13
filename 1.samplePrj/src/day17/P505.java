package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {
	public static void main(String[] args) {
		/*String[] data = {"bat", "baby", "bonus", "cA","ca", "co", "c.",
						"c0", "car", "combat","count","date", "disc"};
		Pattern p = Pattern.compile("c[a-z]*"); //c로 시작하는 소문자영단어
		
		for(int i = 0; i < data.length; i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.print(data[i] + ",");
		}*/
		
		String[] data = {
				"javains", "010-1234-9999", "02-222-3434",
				"javains@naver.com", "a", "A", "1234567", "java test",
				"f" 
		};
		String pattern = "j.*";
		pattern = "(02|010)-\\d{3,4}-\\d{4}"; // '\\d'는 숫자를 뜻함.
		
		Pattern p = Pattern.compile(pattern);
		for(int i =0; i<data.length; i++){
			Matcher matcher = p.matcher(data[i]);
			if(matcher.matches()){
				System.out.println(data[i]);
			}
		}
		System.out.println(" --- main end --- ");
	}
}
