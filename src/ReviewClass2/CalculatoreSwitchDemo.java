package ReviewClass2;

import java.util.Scanner;

public class CalculatoreSwitchDemo {
public static void main(String[]args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your first number");
	int num1 = input.nextInt();
	System.out.println("Please enter your Second number");
	int num2 = input.nextInt();
    System.out.println("Please add one of the operatore");
    char sign=input.next().charAt(0);
	switch (sign) {
	case '+':
	System.out.println("The Sam result for these numbre is "+(num1+num2));
	 break;
	case'-':
		System.out.println("the Result is "+(num1-num2));
       break;
	case'*':
		System.out.println("resut is "+(num1*num2));
       break;
	case'/':
		System.out.println("resut is "+(num1/num2));
       break;
       default:
    	   System.out.println("Sorry the program is not supporting thsi auctin ");
	}
}
}
