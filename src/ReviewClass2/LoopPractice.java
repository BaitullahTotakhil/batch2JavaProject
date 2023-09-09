package ReviewClass2;

public class LoopPractice {
public static void main(String[]args) {
	//loop and do while loop 
	int num = 1;
	
	while (num>1) {
		System.out.println("I am while Loop");
		num--;
	}
	  do {
		System.out.println("I am do while loop");
		num--;
	}
	  while (num>1);
	  
	  int num1=1;
	  while (num1<20) {
		  if(num1%2==0) {
			  System.out.print(num1+ " ");
		  }
		  num1++;
	  }
	  System.out.println("===========================================");
	  int number=1;
	  while (number<=20) {
	  System.out.println(number+" ");
	  number++;
	  }
	  
	  
}
}
