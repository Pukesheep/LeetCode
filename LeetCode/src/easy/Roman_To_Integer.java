package easy;

import java.util.*;

public class Roman_To_Integer {

	public static int romanToInt(String s) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		int prev = map.get(s.charAt(s.length() - 1));
		for (int i = s.length() - 1; i > -1; i--) {
			if (map.get(s.charAt(i)) >= prev) {
				result += map.get(s.charAt(i));
			} else {
				result -= map.get(s.charAt(i));
			}
			prev = map.get(s.charAt(i));
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int a;
		// 3
//		a = romanToInt("III");
		
		// 4
//		a = romanToInt("IV");
		
		// 9
//		a = romanToInt("IX");
		
		// 58
//		a = romanToInt("LVIII");
		
		// 1994
		a = romanToInt("MCMXCIV");
		
		System.out.println(a);
		
	}
	
}
