package ttt;

import java.util.ArrayList;

public class q2 {

	public static void qqq(int[] a) {
		
		
		int count = 0;
		int result = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i; j < a.length; j++) {
				if (list.size() == 0) {
					list.add(a[j]);
				}
				if (a[j] > list.get(list.size() - 1)) {
					list.add(a[j]);
				} else {
					continue;
				}
			}
			
			count = Math.max(list.size() - 1, count);
			result = Math.max(result, count);
			list.clear();
		}
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		
//		int[] a = {0, -3, 1, 4};
		int[] a = {0, -2, 5, 1, 2, 4, 3};
//		int[] a = {11, 10, -10, -1, 19, 3, 17, 14, 1};
		
		qqq(a);
		
	}
	
}
