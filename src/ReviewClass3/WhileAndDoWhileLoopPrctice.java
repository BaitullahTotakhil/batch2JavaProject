package ReviewClass3;

public class WhileAndDoWhileLoopPrctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			     int temp=75;

		     boolean status =true;
		     
		     while(status){
		    	 System.out.println("Weather is not Good enough to go out");
		    	 if(temp==75) {
		    		 System.out.println("Weather is nice I will go out for a walk");
		    	 }    status =false;
		    	 temp++;
		     }
		    
		     int day=1;
		     boolean daystatus=true;
		     do {
		    	 if(day==5){
		    		 System.out.println("Today is friday we dont have a Class");
		    		 daystatus=false;
		    	 }
		    	day++;
		     } while(daystatus);
	}

}
