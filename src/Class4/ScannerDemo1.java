   package Class4;
   import java.util.Scanner;
  public class ScannerDemo1 {
  public static void main(String [] args) {
	// Create a program to ask the user enter his name 
	  Scanner scan =  new Scanner (System.in);
	  System.out.println("Please Add your name");
	  String name = scan.next();
	  System.out.println("you name is "+ name);
	  System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
	  System.out.println("Please tell us what amount of loan do you need");
	   int loan =scan.nextInt();
	   if(loan<20000) {
		   System.out.println("congratulation you are eligible for loan");
	   }else {
		   System.out.println("Sorry we can not loan you more then 200000");
	   }
    }
}
