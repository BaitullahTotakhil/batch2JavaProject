package HomeWork;

import java.util.Scanner;

public class Class4homeworkpart2 {
  public static void main(String []args) {
	  /*
	  Write a program that asks the user's age: "Enter your age "
	  Then display it by adding 10 (i.e age + 10) in your final output.
	  Example Output:
	  Enter your age 30
	  Your age after 10 years is 40
	   */
	  Scanner input = new Scanner(System.in);
	  System.out.println("Please Enter your Age");
	  int age=input.nextInt();
	  int k = age +10;
	  System.out.println("Your age is "+k);
}
}
