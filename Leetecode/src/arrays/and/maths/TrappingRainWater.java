package arrays.and.maths;

		/* 42.Trapping Rain Water
		 * Time Complexity: O(n*n)
		 * Space Complexity:O(1)
		 */

		

public class TrappingRainWater {
	
	public static void trap(int[] height) {
		int ans=0;
		int n=height.length;
		for(int i=0;i<n;i++) {
			int left_max=0;
			int right_max=0;
			for(int j=i;j>=0;j--) {
				left_max=Math.max(left_max, height[j]);
			}
			for(int j=i;j<n;j++) {
				right_max=Math.max(right_max, height[j]);
			}
			ans+=Math.min(left_max, right_max)-height[i];
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
		int[] nums2= {4,2,0,3,2,5};
		printArray(nums2);
		System.out.println();
		trap(nums2);
	}

}
