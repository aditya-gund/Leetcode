package arrays.and.maths;

			/* 42. Trapping Rain Water
			 * Time Complexity: O(n)
			 * Space Complexity: O(n)
			 * Approach: Dynamic Programming
			 */

public class TrappingRainWater1 {

	 public static void trap(int[] height) {
		 int n=height.length;
		 int ans=0;
		 int[] left_max = new int[n];
		 int[] right_max=new int[n];
	        left_max[0]=height[0];
	        for(int i=1;i<n;i++){
	            left_max[i] = Math.max(height[i],left_max[i-1]);
	        }
	        right_max[n-1]=height[n-1];
	        for(int i=n-2;i>=0;i--){
	            right_max[i]=Math.max(height[i],right_max[i+1]);
	        }
		 for(int i=1;i<n-1;i++) {
			 ans=Math.min(left_max[i],right_max[i])-height[i]+ans;
		 }
		 System.out.println("Output: "+ans);
	 }
	
	public static void printArray(int[] nums) {
		System.out.print("[");
        for(int i=0;i<nums.length;i++) {
        	System.out.print(nums[i]+" ");
        }
        System.out.print("]");
	}
	
	public static void main(String[] args) {
		int[] nums= {4,2,0,3,2,5};
		printArray(nums);
		System.out.println();
		trap(nums);
	}

}
