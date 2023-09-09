package Class5;

import java.io.InputStream;
import java.util.Scanner;

   public class SwitchPractice2 {
   public static void main(String []args) {
	
  Scanner scn = new  Scanner (System.in);
  System.out.println("Please enter your country name");
  
  String CountryName=scn.nextLine();
  switch (CountryName){
  case "United Stats":
	  System.out.println("The national language of USA is Engish");
	  break;
  case "Afghanistan":
	  System.out.println("Pashto Dari");
	  break;
  case "India":
	  System.out.println("hindi");
	  break;
	  
	  default:
		  System.out.println("not avalible");
  }
  
}
}

