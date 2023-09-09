package Class5;
import java.util.Scanner;
public class SwitchPractice {
public static void main(String []args) {
	Scanner input =new Scanner (System.in);
	System.out.println("Please Enter your Grade");
	char grade=input.next().charAt(0);
	switch (grade) {
	case 'A':
		System.out.println("Excellent");
		break;
	case 'B':
		System.out.println("Very good");
		break;
	case 'C':
		System.out.println("average");
		break;
	case 'D':
	System.out.println("Not good Enough");
	break;
	default :
		System.out.println("Grade is not accepted");
	}
}
}
