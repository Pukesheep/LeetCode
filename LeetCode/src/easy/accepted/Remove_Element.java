package easy.accepted;

import java.util.Arrays;

public class Remove_Element {

	public static void main(String[] args) {
		
		int[] nums = {3, 2, 2, 3};
		int val = 3;
		
		System.out.println(removeElement(nums, val));
	}
	
	public static int removeElement(int[] nums, int val) {
		
		int count = 0;
		int length = nums.length;
		for (int i = 0; i < length; i++) {
			
			int f = i;
			if (nums[i] == val) {
				
				int[] arr1 = Arrays.copyOfRange(nums, i + 1, nums.length);
				for (int j = 0; j < arr1.length; j++) {
					nums[f] = arr1[j];
					f++;
				}
				i--;
				length--;
				
			} else {
				count++;
			}
		}
		return count;
	}
	
}
