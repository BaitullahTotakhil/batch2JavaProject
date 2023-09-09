package ReviewClass3;

import java.util.Scanner;

public class ArrayPrectice2 {

	private static final int Scanner = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Please enter the size of the Array you want");
    
     int size=scanner.nextInt();    
     
    String[]names=new String[size];
    
           for(int i=0;i<size;i++) {
        	   
    System.out.println("please Add the Text you want to print");
    names[i]=scanner.next();
    }
           for(String str:names) {
        	   System.out.println(str+" ***");
           }
           int [] numbers ={23,34,6,8,9,5,3};
           System.out.println(numbers.length);   
	}
}
