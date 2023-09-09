package Class5;

import java.util.Scanner;

public class SwitchDemo3 {
public static void main(String []args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number ");
	
     int day =3;
     String Weekday="";
     switch(day) {
     
     case 1:
    	 Weekday= "Monday";
         break;
     case 2:
    	 Weekday="tuesday";
    	 break;
     case 3:
    	 Weekday="wedensday";
    	 break;

     case 4:
    	 Weekday="thursday";
    	 break;

     case 5:
    	 Weekday="Friday";
    	 break;
     case 6 :
    	 Weekday="satuday";
    	 break;
     case 7 :
    	 Weekday="Synday";
    	 default:
    		 Weekday="unvalid";
    		 
     }
     
	 System.out.println(day+"="+Weekday);
}
}
