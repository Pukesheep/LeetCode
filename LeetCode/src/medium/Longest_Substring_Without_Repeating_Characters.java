package medium;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {

	public static int lengthOfLongestSubstring(String s) {
		
//		System.out.println(s);
//		int count = 0;
//		int highest = 0;
//		LinkedList<Character> ll = new LinkedList<Character>();
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != '\u0000') {
//				char curr = s.charAt(i);
//				if (count > highest) {
//					highest = count;
//				}
//				if (ll.size() == 0) {
//					ll.add(s.charAt(i));
//					count++;
//					highest++;
//				} else {
//					if (!ll.contains(curr)) {
//						ll.add(s.charAt(i));
//						count++;
//					} 
////					else {
////						ll.clear();
////						count = 1;
////						ll.add(s.charAt(i));
////					}
//				}
//			}
//		}
//		
//		for (char a : ll) {
//			System.out.print(a + ",");
//		}
//		
//		return highest;
		
		        int n = s.length(), ans = 0;
		        Map<Character, Integer> map = new HashMap<>(); // current index of character
		        // try to extend the range [i, j]
		        for (int j = 0, i = 0; j < n; j++) {
		            if (map.containsKey(s.charAt(j))) {
		                i = Math.max(map.get(s.charAt(j)), i);
		            }
		            ans = Math.max(ans, j - i + 1);
		            map.put(s.charAt(j), j + 1);
		        }
//		        pwwkew
		        for (Character a : map.keySet()) {
		        	System.out.println(a);
		        }
		        return ans;
		
		
		
	}
	
	public static void main(String[] args) {
		
//		int i = lengthOfLongestSubstring("abcabcbb");
//		int i = lengthOfLongestSubstring("bbbbb");
//		int i = lengthOfLongestSubstring("pwwkew");
//		int i = lengthOfLongestSubstring(" ");
//		int i = lengthOfLongestSubstring("");
		int i = lengthOfLongestSubstring("dvdf");
		System.out.println(i);
	}
	
}
