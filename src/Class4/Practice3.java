package Class4;

import java.util.Scanner;

public class Practice3 {
 public static void main(String []args) {
	 Scanner khan = new Scanner (System.in) ;
		 
	 System.out.println("Pleas tell us the weather condition tell us true or falls ");
	 boolean wather = khan.nextBoolean();
	 if (wather ) {
		 System.out.println("if weathe is rainy the class will be online");
	 }else {
		 System.out.println("the class will be in person");
	 }
	 
 }
}
