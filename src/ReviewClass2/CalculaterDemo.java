package ReviewClass2;

import java.util.Scanner;

public class CalculaterDemo {
public static void main (String[]args) {
	Scanner Scn = new Scanner(System.in) ;
	System.out.println("Please enter your first number");
	int num1 = Scn.nextInt();
	System.out.println("Please enter your Second number");
	int num2 = Scn.nextInt();
    System.out.println("please Add on of the Operator(+,-<*,/ ");
    char sign=Scn.next().charAt(0);
    if (sign=='+') {
    	System.out.println(" Sam of your numbers is " +( num1+num2 ));
    }else if (sign=='-') {
		System.out.println("the Result is "+(num1-num2));
    }else if (sign=='*') {
    	System.out.println("The mutiplication is "+ (num1*num2));
    }else if(sign=='/') {
    	System.out.println("the result is"+(num1/num2));
    }else {
    	System.out.println("Wrong sign please check it out");
    }
}	
}
