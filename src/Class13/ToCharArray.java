package Class13;

public class ToCharArray {

	public static void main(String[] args) {
  String str1="I love to have a good Jov";
   char []Array=str1.toCharArray();
   System.out.println(Array.length);
    
   String count="";
   
   for(char  n: Array) {
	   if(n =='v') {
		   count+= 'f';
		  continue;
	   }
	   count+=n;
   }
   System.out.println(count);
   
		
   
    for(int i=Array.length-1;i>=0;i--) {
    	System.out.print(Array[i]);
    }
	}
}
