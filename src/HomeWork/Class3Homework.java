package HomeWork;

import java.util.Scanner;

public class Class3Homework {
 public static void main(String[]args) {
	 /*
	 Create 2 Strings
	 Use the concatenation operation to make the following output
	 **Output:**
	 joincoretech.com
	  */
  String course ="joincoretech";
  String web =".com";
  System.out.println(course+web);
  System.out.println("Class 3 homework WH1 done");
  /*
  Write a program to convert double 500.4444 into long.
  Expected Output:
  500
   */
  double num1 = 500.444;
  long num = (int) num1;
  System.out.println(num);
  System.out.println("Class 3 homework WH2 done");
  /*
  Create a float data type variable and assign a value of  8.2 to it
  Multiply the value by itself and print the result.
  **Output:**
  The multiplication of ___ with itself is equal to ____
   */
 double n = 8.2;
 double i = 8.2;
 double answer = n*i;
 System.out.println("The multiplication of value with itself is equal to "+answer);
 System.out.println("Class 3 homework WH3 i have done it this way i need to ask you Sir");
 /*
 The variable "num" holds an integer input from a user
 Write a conditional statement starting on line 9 that does the following:
 If num is positive, print "__ is positive"
 If num is negative, print "__ is negative"
 If num is equals to 0, then print "Entered number is equals to 0"
 Examples:
 In: 5
 5 is positive
 In: -2
 -2 is negative
 In: 0
 Entered number is equals to 0
  */
 Scanner scn=new Scanner(System.in);
 System.out.println("please enter your your number");
 int input= scn.nextInt();
 if (input>0) {
	 System.out.println("the number is positive");
 }else {
	System.out.println("yout number is negative");
 }
 System.out.println("Class 3 homework WH4 done");

}
}
