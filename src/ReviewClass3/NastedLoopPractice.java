package ReviewClass3;

public class NastedLoopPractice {

	public static void main(String[] args) {
      for(int i=1;i<=4;i++) {
    	  for(int k=1;k<=4;k++) {
    		  System.out.print(" * ");
    	  }
    	  System.out.println();
      }
      for (int m=1;m<=5;m++) {
    	  for(int l=1;l<=m;l++) {
    		  System.out.print(" $ ");
    	  }
    	  System.out.println();
      }
     for (int k=5;k>=1;k--) {
    	 for(int j=1;j<=k;j++) {
    		 System.out.print(" # ");
    	 }
    	 System.out.println();
     }
    for(int j =1;j<=10;j++) {
    	for(int h=1;h<=10;h++) {
    		System.out.print(" "+j*h);
    	}
    	System.out.println();
    }
	}

}
