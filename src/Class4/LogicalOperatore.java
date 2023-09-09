package Class4;

import java.util.Scanner;

public class LogicalOperatore {
public static void main(String [] args) {
	
	int day=4;
	if(day>=1 && day<=5) {
		System.out.println(" it is week day");
	}else if (day >=6 && day<=7 ){
		
		System.out.println("it weekend");
	}else {
		System.out.println("Invalid Day");
	}
	Scanner Scn = new Scanner (System.in);
	System.out.println("Please enter your height");
	
	int height =Scn.nextInt();
	if (height<5) {
		System.out.println("You are in Short people Catagory");
	}else if (height >=5 && height <=6) {
		System.out.println("you are in mediem people catagory");
	}else {
		System.out.println("you are in Tall people Catagory");
	}
	
}
}
