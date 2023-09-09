package Class6;

   public class IncreamentDecrement {
   public static void main (String []args) {  
   boolean WorkDay=true;
 
   int day = 1;
     
   while (WorkDay==true) {
	   System.out.println("I need an Off Day");
	   day++;
	   
	   if (day==6|| day==7) {
		   System.out.println("I Dont need an Off day");
		   WorkDay=false;

	   }
   }
 
}
}
