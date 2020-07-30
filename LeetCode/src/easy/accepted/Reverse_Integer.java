package easy.accepted;

import java.util.*;

public class Reverse_Integer {

	public static int reverse(int x) {
		int a = x;
		boolean neg = a > 0 ? false : true;
		StringBuffer sb = new StringBuffer();
		while (a != 0) {
			int temp = a;
			temp %= 10;
			sb.append(Math.abs(temp));
			a /= 10;
		}
		if (neg) {
			sb.insert(0, "-");
		}
		
		Integer result = null;
		try {
			result = Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {
			return 0;
		}
		
		
		return result;
	}
	
	public static void main(String[] args) {
		
//		int i = reverse(1534236469);
//		int i = reverse(123);
		int i = reverse(-123);
//		int i = reverse(120);
		System.out.println(i);
	}
	
}
