package Class10;

public class ForLoopGet2DElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [][] numbrs={
    		  {22,45,6,678,34,23,3},
    		  {34,56,67,890,56,34,},
    		  {34,23,12,6,678,789},
      }	;
      System.out.println("row numbers" + numbrs.length);
      System.out.println("Row elements "+ numbrs[2].length);
      System.out.println();
      for(int [] Nunber:numbrs) {
    	  for (int N:Nunber) {
    	  if(N%2!=0) {
    		  System.out.print(N+" @@ ");
    	  }
    	  }
      }
       int sum=0;
       for (int []khan:numbrs) {
    	  for(int K:khan) {
    		 sum+=K; 
    	  }
       }
       System.out.println("total  is "+sum);
	}

}
