package HomeWork;

import java.util.Scanner;

public class Class4HomeWork {
public static void main(String[]args) {
	/*
	HW-1
	Write a program that takes user's first name and last name and prints in console
	Instruct the user to enter first name: "Please Enter First Name"
	Capture the first name
	Instruct the user to enter last name:"Please Enter Last Name"
	Capture last name
	Print first name and last name
	Final Output:
	Example:
	Please Enter First Name
	Please Enter Last Name
	Cindy Crawford
	 */
	System.out.println("Enter your First name");
	Scanner scn=new Scanner(System.in);
     String I = scn.nextLine();
     System.out.println("Enter your LastName");
	String K = scn.nextLine();
	System.out.println("Your First name is  "+I+" and yout last name is " +K);
	
}

}
