package ReviewClass2;

import java.util.Scanner;

public class Demo1 {
public static void main (String[]args) {
      Scanner Ali = new Scanner(System.in);
  	 System.out.println("Please tell us about your cridet card answer wth true/false");
  	 
  	 boolean CreditCard = Ali.nextBoolean();
  	 
  	 if (CreditCard){
  		 System.out.println("Good Job keep it up");
  	 }else {
  		 System.out.println(" Talk to my Boss we have good plane to make one");
  	 }
}
}

