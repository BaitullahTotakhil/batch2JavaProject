   package Class5;

import java.util.Scanner;

public class FindLargnumberInnastedIF {
  public static void main(String []args) {
	 Scanner num=new Scanner (System.in);
     System.out.println("Put number to find the largest number");
     int num1 = num.nextInt();
     System.out.println("Enter second number");
     int num2 =num.nextInt();
     System.out.println("Please enter the thirs number");
     int num3 =num.nextInt();
     
     if(num1>num2) {
    	 if (num1>num2) {
        	 System.out.println("the largest number is "+num1);
    	 }
     } else if(num2 >num3) {
    	 System.out.println("the largest number is "+num2);
     }else {
    	 System.out.println("the largest number is "+num3);
     }
     
}
}
