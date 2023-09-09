package Class3;

public class CastingDemo {

	public static void main (String[]args) {
	// Casting is add one type of value to another its might be widening or narrowing.
	//Widding we can call implicit or Automatic. its when we convert a small number to bigger.
		int num1 = 2;
		double num2 = num1;
		System.out.println(num1);
		System.out.println(num2);
		num1=(int)num2;
		System.out.println(num1);
		int num3 = 30;
		float num4=num3;
		System.out.println(num4);
		//Narrowing Casting is Explicit/ Manually bigger data typ tp smaller.
		num3 = (int) num4;
		System.out.println(num3);

	}
}
