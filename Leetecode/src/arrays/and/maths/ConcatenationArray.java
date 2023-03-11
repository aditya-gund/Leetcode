package arrays.and.maths;

import java.util.Arrays;
import java.util.Scanner;

 					/*Problem:1929. Concatenation of Array
 					 *Time Complexity: O(n)
 					 *Space Complexity: O(n)*/
public class ConcatenationArray {

	public void ArrayConcatenation(int nums[]){
		int n=nums.length;
		int ans[] = new int[2*n];
		for(int i=0;i<n;i++) {
			ans[i]=nums[i];
			ans[i+n]=nums[i];
		}
		printArray(ans);
	}
	static void printArray(int []nums) {
		System.out.print("[");
		for(int i=0;i<nums.length;i++) {
			System.out.printf("%2d,",nums[i]);
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Elements in Array: ");
		int n=sc.nextInt();
		int[] nums= new int[n];
//		System.out.println("Enter Elements in Array: ");
		for(int i=0;i<n;i++) {
			System.out.println("Enter "+i+" th element in an Array: ");
			nums[i]=sc.nextInt();
		}
		ConcatenationArray arr = new ConcatenationArray();
		printArray(nums);
		System.out.println();
		arr.ArrayConcatenation(nums);
		
	}

}
