package easy.accepted;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		int[] aa = twoSum(nums, target);
		for (int a : aa) {
			System.out.print(a + ",");
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target) {
		
		int[] output = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int[] arr1 = Arrays.copyOfRange(nums, i + 1, nums.length);
			for (int j = 0; j < arr1.length; j++) {
				if (arr1[j] + nums[i] == target) {
					output[0] = i;
					output[1] = i + 1 + j;
					break;
				}
			}
		}
		return output;
	}
	
}
