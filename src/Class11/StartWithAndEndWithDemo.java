package Class11;

public class StartWithAndEndWithDemo {

	  public static void main(String[] args) {
		
        String J ="These methods are only used in String";
        System.out.println(J.startsWith("T"));
        System.out.println(J.startsWith("k"));
        
        if(J.startsWith ("These ")|| J.startsWith("These")){
        System.out.println("Bothe ways are plural");
        
        }else {
        	System.out.println("the subject is singuler");
        }
       System.out.println(J.endsWith("String"));
	}
		
}
