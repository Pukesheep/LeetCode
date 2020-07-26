package easy.accepted;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		
		int[] nums = {12, 345, 2, 6, 7896};
		
		int a = findNumbers(nums);
		System.out.println(a);
		
	}
	
	public static int findNumbers(int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			int number = Integer.toString(nums[i]).length();
			if (number % 2 == 0) {
				count += 1;
			}
		}
		return count;
	}
	
}
