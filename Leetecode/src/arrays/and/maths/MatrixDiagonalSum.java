package arrays.and.maths;

import java.io.IOException;
import java.util.Arrays;

 /* 1572. Matrix Diagonal Sum
  * Time Complexity: O(m+n)
  * Space Complexity: O(n)
  */

// Print the Matrix
public class MatrixDiagonalSum {
	static void print2DMatrix(int mat[][]){
		for(int[] row: mat) {
			System.out.println(Arrays.toString(row));
		}
		
	}
// Sum of Diagonal Elements
	static int DiagonalSum(int mat[][]) {
		int sum=0;
		int n=mat.length;
		for(int i=0;i<=mat.length-1;i++) {
			for(int j=0;j<=mat[0].length-1;j++) {
				if(i==j || i+j==n-1)
					sum=sum+mat[i][j];
			}
		}
		return sum;
	}
	
	//Driver Code
	public static void main(String[] args)throws IOException  {
	
		 int mat[][] = { {1,1,1,1},
                 {1,1,1,1},
                 {1,1,1,1},{1,1,1,1}};
		 print2DMatrix(mat);
		 int n=DiagonalSum(mat);
		 System.out.println("Sum of Diagonal = "+n);
	}

}
