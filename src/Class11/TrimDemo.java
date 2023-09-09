package Class11;

public class TrimDemo {

	public static void main(String[] args) {
     String Name1="              Baitullah";
     System.out.println(Name1);
     System.out.println(Name1.trim());
    String Name2= "     this is just some Extra practice of trim      ";
     System.out.println(Name2.trim().concat(Name1.trim()));
    		 
	}

}
