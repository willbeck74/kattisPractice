import java.util.Scanner;

public class aDifferentProblem {
//Something is wrong here...
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		
		String[] nums = a.split(" ");
		
		long one = Long.parseLong(nums[0]);
		long two = Long.parseLong(nums[1]);
		
		if (one > two) {
			System.out.print(Math.abs(two - one));
		} else {
			System.out.print(Math.abs(one - two));
			}
	}
}
