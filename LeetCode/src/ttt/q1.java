package ttt;

import java.util.ArrayList;

public class q1 {
	
	public static void ttt(int n) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		for (int i = 1; i <= n; i++) {
			
			if (i == 1) {
				list.add("(" + i + "," + n + ")");
			} else if (i == n) {
				for (int j = 1; j <= (n * 2) - 1; j++) {
					list.add("(" + n + "," + j + ")");
				}
			} else {
				list.add("(" + i + "," + (n - (i - 1)) + ")");
				list.add("(" + i + "," + (n + (i - 1)) + ")");
			}
		}
		
		for (String st : list) {
			System.out.print(st + ",");
		}
		
	}
	

	public static void main(String[] args) {
		
		ttt(5);
		
	}
	
}
