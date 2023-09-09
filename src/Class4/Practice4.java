package Class4;
import java.util.Scanner;
public class Practice4 {
public static void main (String []args ){
	Scanner Scn = new Scanner (System.in);
	 System.out.println("Please Ente yout Quiz Score");
	  int quiz = Scn.nextInt();
	  System.out.println("Please midtaram score");
	  int midtaram=Scn.nextInt();
	  System.out.println("Please enter your Final score");
	  int finalscore=Scn.nextInt();
	  int avg=(quiz+midtaram+finalscore)/3;
	  if (avg >=90) {
		  System.out.println("Congratulation you passsed in Grade A");
	     }else if(avg>=70&& avg <90) {
	    	 System.out.println("Congrats you passed in Grade B");
	     }else if (avg >=50 && avg<70) {
	    	 System.out.println("YOu pass Grade C");
	     }else {
	    	 System.out.println("Sorry you are fail this time");
	     }
      }
   } 
