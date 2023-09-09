package Class4;
public class NastedIFCondition {
public static void main(String[]args) {
	 int age = 55;
	 if (age < 18) {
		 System.out.println("you need your father permisstion to work");
	 }else {
		System.out.println("you are good to work with us"); 
	 } if (age<=64 ) {
		 System.out.println("you are eligible for work");
	 }else {
		 System.out.println("You can enjoy your life this is you rest time");
	 }
	 boolean deploma = true;
	 boolean NA = false;
	 double gpa= 2.9;
	   if (NA) {
		   System.out.println("Congratlation you have diploma");
		   if (gpa>=3.5) {
		      System.out.println("you are eligible for scholorship");
		   }else {
			   System.out.println("Sorry your gpa is less then 3.5");
		   }
	   }else {
		   System.out.println("Sorry First you need to get your Deploma");
	   } 
 } 
}
