package ttt;

import java.util.*;

public class q4 {
	
	public static boolean qqq(String s) {
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("(", ")");
		map.put("[", "]");
		map.put("{", "}");
		
		String temp, check, target;
		
		for (int i = 0; i < s.length(); i++) {
			temp = Character.toString(s.charAt(i));
			for (int j = i + 1; j < s.length(); j++) {
				check = map.get(temp);
				if (check != null) {
					target = Character.toString(s.charAt(j));
					if (target.equals(check)) {
						break;
					} else if (target.equals("(") || target.equals("[") || target.equals("{")) {
						return false;
					}
				} else {
					break;
				}
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		String s;
//		s = "(([()]))))";
		s = "(){{[]}}";
//		s = "(([([{]})]))";
		
		boolean b =qqq(s);
		System.out.println(b);
		
	}
	
}
