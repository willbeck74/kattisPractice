import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int num1 = in.nextInt(), num2 = in.nextInt(), num3 = in.nextInt();
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(num1);
		nums.add(num2);
		nums.add(num3);
		Collections.sort(nums);
		
		String order = in.next();
		
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("A", nums.get(0));
		hmap.put("B", nums.get(1));
		hmap.put("C", nums.get(2));
		
		System.out.println(hmap.get(order.substring(0, 1)) + " "
				+ hmap.get(order.substring(1, 2)) + " " + hmap.get(order.substring(2, 3)));
		
	}

}
