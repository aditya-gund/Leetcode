package arrays.and.maths;
import java.util.*;
public class FizzBuzz {
	/* Problem: 412. Fizz Buzz
	 * Time Complexity : O(n)
	 * Space Complexity: O(n)
	 */
	public List<String> fizzBuzz(int n){
		ArrayList<String> ans = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0)
				ans.add("FizzBuzz");
			else if(i%3==0)
				ans.add("Fizz");
			else if(i%5==0)
				ans.add("Buzz");
			else
				ans.add(i+"");
		}
		return ans;
	}
	public static void main(String[] args) {
			FizzBuzz fz = new FizzBuzz();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int n=sc.nextInt();
			System.out.println(fz.fizzBuzz(n));
			
		
	}

}
