package Class9;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    char[]grad =new char[6];
    grad [0]='A';
    grad [1]='B';
    grad [2]='C';
    grad [3]='D';
    grad [4]='E';
    grad [5]='F';
    System.out.print(grad[0]+" ");
    
    char[] grad2 = {'A','B','C','D','E','F'};
    System.out.println(grad2[1]);
   
    int [] numbers= {3,5,5,5};
    
    int sum=0;
    for(int num:numbers) {     
    	sum+=num;
    	System.out.print(num +" " );
    }
	System.out.println();
	System.out.println("the sam of this array is"+sum);
	}

}
