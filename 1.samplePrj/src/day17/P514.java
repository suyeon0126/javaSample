package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {
	public static void main(String[] args) {
		String msg = "ȫ�浿: 90/100/80";
		String[] data = msg.split(":");
		System.out.println(Arrays.toString(data));
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu));
		System.out.println("------------------------");
		
		StringTokenizer st = new StringTokenizer(msg, ":/", true);
		//System.out.println(st.countTokens()); 
		while(st.hasMoreTokens()){
			String s = st.nextToken().trim();
			System.out.println(s);
		}
		
	}
}
