package arrays.and.maths;
import java.util.*;

	/*
	 * 1131. Maximum of Absolute Value Expression
	 */

public class maxAbsValExpression {
	public static void maxAbsValExpr(int[] arr1, int[] arr2) {
		int n=arr1.length;
		int[] a= new int[n]; //si+ti+i
		int[] b= new int[n]; //si-ti+i
		int[] c= new int[n]; //si+ti-i
		int[] d= new int[n]; //si-ti-i
		for(int i=0;i<n;i++) {
			int si=arr1[i];
			int ti=arr2[i];
			 a[i]=si+ti+i;
		        b[i]=si-ti+i;
		        c[i]=si+ti-i;
		        d[i]=si-ti-i;
		}
		int ans1=findDiffMinMax(a);
		int ans2=findDiffMinMax(b);
		int ans3=findDiffMinMax(c);
		int ans4=findDiffMinMax(d);
		int ans=Math.max(Math.max(ans1,ans2),Math.max(ans3,ans4));
		System.out.println("Output: "+ans);
	}
	public static int findDiffMinMax(int[] nums) {
		int n=nums.length;
	    int minEle=nums[0];
	    int maxEle=nums[0];
	    for(int i=1;i<n;i++){
	        minEle = Math.min(minEle,nums[i]);
	        maxEle = Math.max(maxEle,nums[i]);
	    }
	    return maxEle-minEle;  
	}
	static void printArrays(int[] nums1, int[] nums2) {
		System.out.print("[");
		for(int i=0;i<nums1.length;i++) {
			System.out.print(" "+nums1[i]);
		}
		System.out.print("]");
		System.out.println();
		System.out.print("[");
		for(int i=0;i<nums2.length;i++) {
			System.out.print(nums2[i]+" ");
		}
		System.out.print("]");
	}
	public static void main(String[] args) {
		int[] nums1= {1,-2,-5,0,10};
		int[] nums2= {0,-2,-1,-7,-4};
		printArrays(nums1,nums2);
		System.out.println();
		maxAbsValExpr(nums1,nums2);
	}

}
