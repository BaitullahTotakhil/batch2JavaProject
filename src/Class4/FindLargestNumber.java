package Class4;

public class FindLargestNumber {
public static void main(String []args) {
	
	double num1 = 2000;
	double num2 = 90;
	double num3 = 100;
	if (num1>num2 && num1>num3) {
		System.out.println("The largest number is "+num1);
	}else if(num2 >num3) {
		System.out.println("The largest number is "+num2);
	}else {
		System.out.println("the largest number is "+num3);
	}
}
}
