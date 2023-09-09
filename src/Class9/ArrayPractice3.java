package Class9;

public class ArrayPractice3 {
public static void main (String[]args) {
	
	int [] numbers= {10,30,40,60};
	
	System.out.println(numbers[0]);
	
	System.out.println("this is the lengh of Array " +numbers.length);
	
  for (int i=0; i<numbers.length;i++) {
	  System.out.print(numbers[i]+" ");
  }
  System.out.println();
  for(int i=numbers.length-1;i>=0;i--) {
	  System.out.print(numbers[i]+" ");
  }
}
}
