    package Class9;

    public class ArrayPractice {
    public static void main(String[]args) {
	int []number = new int[5];
	number[0]=90;
	number[1]= 20;
	number[2]=10;
	number[3]=30;
	number[4]=60;
    System.out.println("number0 is " +  number [0] +  " number1 " + number [1] +  " number2 " + number[2]);                            
	System.out.println(number[4]);
	double[] num=new double[4];
	num[0]=10.9;
	num[1]=30.8;
	num[2]=40.8;  
	System.out.println(" number1 "+ num [0]+  " number2 " + num [1]+ " number3 " + num[2]);
	
	String []ArrayOfNames=new String[2];
	ArrayOfNames[0]="Raihan";
	ArrayOfNames[1]="Omar";
	System.out.println(ArrayOfNames[0] + " Second Child " + ArrayOfNames[1]);
	boolean []k=new boolean[3];
	k[0]=true;
	k[1]=false;
	k[2]=false;
	System.out.println("print me the value of k tow and zero are " + k[2] +" "+ k[0]);
	int[]num2;
	num2=new int[2];
	num2[0]=10;
	num2[1]=20;
	System.out.println("this is just an other example of array Integer " +num2[1]);
	char []i= new char[2];
	i[0]='a';
	i[1]='r';
	System.out.println(i[0]+" "+i[1]);
	
}
}
