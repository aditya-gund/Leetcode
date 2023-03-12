package Maths;

import java.util.ArrayList;
import java.util.Scanner;

public class SelfDivide {

		/* 
		 * 728. Self Dividing Numbers
		 */
	
	
    public static void selfDividingNumbers(int left, int right) {
        ArrayList<Integer> ans = new ArrayList<>();
     for(int i=left;i<=right;i++) {
    	   if(selfDividing(i)) {
           	ans.add(i);
           }
     }
     System.out.print(ans);
    }
	public static boolean selfDividing(int n) {
		int x=n;
		while(x>0) {
			int d=x%10;
			x=x/10;
			if(d==0 || (n%d)>0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		selfDividingNumbers(47,85);
	}

}
