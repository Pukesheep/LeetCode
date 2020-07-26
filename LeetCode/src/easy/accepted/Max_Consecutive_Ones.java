package easy.accepted;

public class Max_Consecutive_Ones {
	
	 public static void main(String[] args) {
		 
		 int[] nums = {
				 		1, 1, 0, 1, 1, 1
	 				};
		 
		 int i = findMaxConsecutiveOnes(nums);
		 System.out.println(i);
		 
	 }
	
	

	public static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0;
		int result = 0;
		
		for (int i = 0; i < nums.length; i++) {
			
			if (nums[i] == 1) {
				count += 1;
			} else {
				count = 0;
			}
			if (count > result) {
				result = count;
			}
		}
		return result;
	}
	
}
