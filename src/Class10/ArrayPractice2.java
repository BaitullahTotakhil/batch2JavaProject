package Class10;

public class ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String [][]countries =  {{"Usa","Afgh","mexco","india","Australia"},
    		                   {"germany","Usa","Afgh","mexco","india",},
    		                   {"Usa","Afgh","mexco","india","Australia"},
    		                   {"Usa","Afgh","mexco","india","Australia"},
    		                   {"germany","Usa","Afgh","mexco","india",},
    		                   {"Usa","Afgh","mexco","india","Australia",}           
      };
       System.out.println("the number of the row is "+countries.length);
       System.out.println("the number of element in the first row is "+countries[1].length);
          for(int r=0; r<countries.length; r++) {
    	  for (int c=0; c<countries[r].length; c++) {
    		  System.out.print(countries[r][c]+" ");
    		  System.out.println(); 
    	  }
      }
        for (String []country:countries) {
	    for (String  c:country) {
		System.out.print(c+" ** ");
 }	 
 }    
 }          
 }
