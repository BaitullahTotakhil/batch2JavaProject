package ReviewClass4;

public class NameBabbyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String Momname="Diana";
    String Dadname="Smith";
    String Babby="boy";
    
    if(Babby.equalsIgnoreCase("girl")) {
    int middle=Dadname.length()/2;
    System.out.println(Momname.substring(0,2)+Dadname.substring(middle));
    }else {
    	int middle2=Momname.length()/2;
    	System.out.println(Dadname.substring(0,2)+Momname.substring(middle2));
    }
    
	}

}
