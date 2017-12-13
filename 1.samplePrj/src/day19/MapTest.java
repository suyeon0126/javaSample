package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("java01", "1234");
		map.put("java01", "3214"); // key값 절대 중복불허. 중복이되면 마지막 데이터가 오버라이트됨.
		map.put("java12", "0003");
		map.put("java04", "3096");
		map.put("java05", "0703");
		map.put("java09", "5678");
		map.put("java30", "9958");
		map.put("java17", "330408");
		map.put("java21", "201409");
		map.put("java14", "920506");

		while (true) {
			System.out.println("-------- 로그인 처리 --------");
			Scanner scanner = new Scanner(System.in);
			System.out.print(" ID를 입력하세요. : _ ");
			String id = scanner.nextLine();
			System.out.print(" PW를 입력하세요. : _ ");
			String pw = scanner.nextLine();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 ID는 등록된 ID가 아닙니다.");
				System.out.println("ID를 다시 입력해주세요.");
			} else {
				if (!(map.get(id).equals(pw))) {
					System.out.println("비밀번호가 일치하지않습니다.");
					System.out.println("비밀번호를 다시 입력해주세요.");
				} else {
					System.out.printf("%s님이 로그인하였습니다.%n", id);
					break;
				}
			}
		}
		System.out.println("환영합니다.");

		/*System.out.println(map); 
		 System.out.println(map.get("java21"));*/
		
		// 순회
		//System.out.println(map.keySet()); // key 값만 가져오고 싶을 때는 .keySet() 사용.
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyname = it.next();
			System.out.println("ID : " + keyname + ", PW : " + map.get(keyname));
		}				
	}
}