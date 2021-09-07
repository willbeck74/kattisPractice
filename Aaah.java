import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String jon = input.next(), doc = input.next();
		
		if(jon.length() >= doc.length()) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
		
	}

}
