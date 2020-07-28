package medium;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

	public static int lengthOfLongestSubstring(String s) {
		
		System.out.println(s);
		char temp;
		LinkedHashSet<Object> lhs = new LinkedHashSet<Object>();
		LinkedList<Object> ll = new LinkedList<Object>();
		for (int i = 0; i < s.length(); i++) {
			
			if (ll.size() != 0) {
				if (ll.get(ll.size() - 1).equals(temp)) {
					
				}
			}
			
			temp = s.charAt(i);
			
		}
		System.out.println("========");
		for (Object a : ll) {
			System.out.print(a + " ");
		}
		
		return ll.size();
	}
	
	public static void main(String[] args) {
		
//		int i = lengthOfLongestSubstring("abcabcbb");
//		int i = lengthOfLongestSubstring("bbbbb");
		int i = lengthOfLongestSubstring("pwwkew");
		System.out.println(i);
	}
	
}
