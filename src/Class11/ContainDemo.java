package Class11;

public class ContainDemo {
public static void main(String []args) {
	
     String str="34535 Student";
	 System.out.println(str.contains("Student"));
		
	String khan="98374(*(&^%*&%$";
	System.out.println(khan.contains("&^%*&%$"));
	
		String Password="345*& &%*";
	   	 if(Password.contains("^!")) {
	   		 System.out.println("This sign is not allowed is the passwprd");
	   		 
	   	 }else {
	   		 System.out.println("this is a valid password");
	   	 }
	
}
}
