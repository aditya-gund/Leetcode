package Maths;

import java.util.Arrays;

	/*
	 * 1979. Find Greatest Common Divisor of Array
	 */

public class GCDArray {

	
	public static void MinMaxArray(int[] nums) {
		Arrays.sort(nums);
		int minEle=nums[0];
		int maxEle=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>maxEle) {
				maxEle=nums[i];
			}
		}
		System.out.println("Minimum: "+minEle);
		System.out.println("Maximum: "+maxEle);
		int ans=gcd(minEle,maxEle);
		System.out.println("GCD("+minEle+","+maxEle+")= "+ans);
	}
	public static void printArray(int[] nums) {
		System.out.print("[");
		for(int i=0;i<=nums.length-1;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println("]");
	}
	public static int gcd(int a,int b) {
		if(a==0)
			return b;
		return gcd(b%a,a); //Time complexity: O(log2(Min(a,b)));
	}
	public static void main(String[] args) {
	int nums[]= {2,5,6,9,10};
	printArray(nums);
	MinMaxArray(nums);
	}

}
