package ReviewClass2;

import java.util.Scanner;

public class Task2 {
public static void main (String []args) {
	Scanner Khan = new Scanner(System.in);
	System.out.println("Please Enter your First name");
	
	String FirstName =Khan.nextLine();
	System.out.println(" Please Enter your last name");
	
	String lastName =Khan.nextLine();
	
	System.out.println("Hello your First name is " + FirstName + " "
			+ "Your Last name is " + lastName);
}   
}
