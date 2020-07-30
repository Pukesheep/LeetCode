package easy;

public class Palindrome_Number {

	public static boolean isPalindrome(int x) {
		
		String a = String.valueOf(x);
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length(); i++) {
			sb.insert(0, a.charAt(i));
		}
		
		return sb.toString().equals(a);
		
//		return false;
	}
	
	public static void main(String[] args) {
		
		boolean b;
		
//		b = isPalindrome(121);
//		b = isPalindrome(-121);
		b = isPalindrome(10);
		
		System.out.println(b);
		
	}
	
}
