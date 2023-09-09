package HomeWork;

import java.util.Scanner;

public class Class4HomeWorkpart3 {
public static void main(String []args) {
	/*
	Create a program that will ask a user to input boolean value "Input the boolean value"
	If the input is true or false, then the output should look like below:
	Example Output:
	Input the boolean value
	The value is true
	Example Output:
	Input the boolean value
	The value is false
	 */
	System.out.println("please put a Boolean Value");
	Scanner input=new Scanner(System.in);
    boolean k = input.nextBoolean();
    if(k==true) {
    	System.out.println("The Boolean value is True");
    }else if(k==false) {
    	System.out.println("The boolean value is Fales");
    }else {
    	System.out.println("unvalid Vlaue");
    }
	
}
}
