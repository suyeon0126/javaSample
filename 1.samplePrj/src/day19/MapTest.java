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
		map.put("java01", "3214"); // key�� ���� �ߺ�����. �ߺ��̵Ǹ� ������ �����Ͱ� ��������Ʈ��.
		map.put("java12", "0003");
		map.put("java04", "3096");
		map.put("java05", "0703");
		map.put("java09", "5678");
		map.put("java30", "9958");
		map.put("java17", "330408");
		map.put("java21", "201409");
		map.put("java14", "920506");

		while (true) {
			System.out.println("-------- �α��� ó�� --------");
			Scanner scanner = new Scanner(System.in);
			System.out.print(" ID�� �Է��ϼ���. : _ ");
			String id = scanner.nextLine();
			System.out.print(" PW�� �Է��ϼ���. : _ ");
			String pw = scanner.nextLine();

			if (!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ID�� ��ϵ� ID�� �ƴմϴ�.");
				System.out.println("ID�� �ٽ� �Է����ּ���.");
			} else {
				if (!(map.get(id).equals(pw))) {
					System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�.");
					System.out.println("��й�ȣ�� �ٽ� �Է����ּ���.");
				} else {
					System.out.printf("%s���� �α����Ͽ����ϴ�.%n", id);
					break;
				}
			}
		}
		System.out.println("ȯ���մϴ�.");

		/*System.out.println(map); 
		 System.out.println(map.get("java21"));*/
		
		// ��ȸ
		//System.out.println(map.keySet()); // key ���� �������� ���� ���� .keySet() ���.
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String keyname = it.next();
			System.out.println("ID : " + keyname + ", PW : " + map.get(keyname));
		}				
	}
}