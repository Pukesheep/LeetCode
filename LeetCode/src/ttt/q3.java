package ttt;

import java.util.*;

public class q3 {

	public static void qqq(int n) {
		
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		
		System.out.println(n + "=");
		for (int i = 2; i <= n; i++) {
			while (n % i == 0 && n != i) {
				n /= i;
				if (map.containsKey(i)) {
					String s = map.get(i);
					if (s.contains("^")) {
						
						char s2 = s.charAt(s.indexOf("^") + 1);
						int cc = s2;
						System.out.println("s2="+s2);
						System.out.println("cc=" +cc);
						
						
					} else {
						s += "^";
						s += "2";
						map.put(i, s);
					}
				} else {
					map.put(i, String.valueOf(i));
				}
			}
			if (n == i) {
				map.put(i, String.valueOf(i));
				
				break;
			}
		}
		for (int c : map.keySet()) {
			System.out.print(map.get(c));
			System.out.print("*");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		qqq(600);
		
	}
	
}
