package day16.lang;

public class P464 {
	public static void main(String[] args) {
		String msg = "Hello java test ~~~~";
		System.out.println(msg);
		System.out.println(msg.replace('~', '!')); //String은 읽기 전용이기 때문에 바뀌지않음.
		System.out.println(msg);
		msg.concat(" sample");
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("StringBuffer test"); //String 빌더와 버퍼는 쓰기작업 허용.
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append("sample");
		System.out.println(sb);
		String s = sb.toString(); //String버퍼에서 String으로 
		
		
		
	}
}
