package Class10;

public class ArrayInLargeNumber {

	public static void main(String[] args) {
	int  []numbers = {345,6,34,23,56,34};
	      int large=0;
	       for(int num:numbers) {
	    	   if(large<num) {
	    		   large=num;
	    	   }
	       }
		System.out.println("The largest number is "+ large);
				System.out.println();
		int  Small= numbers[0];
		for(int num:numbers) {
			if(Small>num) 
				Small=num;
		}
		System.out.println("The Smallest nymber is" +Small);
	}
}
