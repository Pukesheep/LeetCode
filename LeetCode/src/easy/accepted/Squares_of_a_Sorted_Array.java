package easy.accepted;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array {

	public static void main(String[] args) {
		
		int[] A = {-4, -1, 0, 3, 10};
		int[] B = {-7, -3, 2, 3, 11};
		
		int[] AA = sortedSquares(A);
		for (int a : AA) {
			System.out.print(a + ",");
		}
		System.out.println("=================");
		int[] BB = sortedSquares(B);
		for (int b : BB) {
			System.out.print(b + ",");
		}
		System.out.println("=================");
	}
	
	public static int[] sortedSquares(int[] A) {
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.pow(A[i], 2);
		}
		Arrays.sort(A);
		return A;
	}
	
}
