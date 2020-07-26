package easy.accepted;

import java.util.Arrays;

public class Duplicate_Zeros {

	public static void main(String[] args) {
		int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
		duplicateZeros(arr);
	}
	
	public static void duplicateZeros(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == 0) {
				
				int[] arr1 = Arrays.copyOfRange(arr, i, arr.length);
				int f = i;
				
				for (int j = 0; j < arr1.length; j++) {
					
					if (f < arr.length - 1) {
						f++;
					} else {
						break;
					}
					arr[f] = arr1[j];
				}
				i++;
			}
		}
		for (int a : arr) {
			System.out.print(a + ",");
		}
	}
	
}
