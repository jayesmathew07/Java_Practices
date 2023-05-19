package training;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Your Name :");
		
		String name =scan.nextLine();
		System.out.println("My Name is :" +name);
		
	}

}
