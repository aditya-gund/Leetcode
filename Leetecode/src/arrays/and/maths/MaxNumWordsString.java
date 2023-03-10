package arrays.and.maths;


		/* 2114. Maximum Number of Words Found in Sentences
		 * Time Complexity: O(n)
		 * Space Complexity: O(1)
		 */

public class MaxNumWordsString {
	
	public int mostSentenceFound(String[] sentence) {
		 int ans=0;
		 int count=0;
		 for(String s:sentence) {
			 for(int i=0;i<s.length();i++) {
				 if(s.charAt(i)==' ') {
					 count++;
				 }
				 count=0;
			 }
			 ans=Math.max(ans, count);
		 }
		 return ans+1;
	}
	public static void printString(String[] sentence) {
		for(String s:sentence) {
			System.out.print(s+" ");
		}
	}
	public static void main(String[] args) {
		MaxNumWordsString str = new MaxNumWordsString();
		String[] sen= {"'alice and bob love leetcode'" , "'i think so too'" , "'this is great thanks very much'" , "'please wait'"};
		printString(sen);
		System.out.println();
		System.out.println();
		int n=str.mostSentenceFound(sen);
		System.out.println("Maximum number of words : "+n);
		}
	}


