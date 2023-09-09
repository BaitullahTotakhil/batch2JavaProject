package Class11;

public class IsEmptyDemo {

	public static void main(String[] args) {
  String UserName="";
   System.out.println(UserName.isEmpty());
   if(UserName.isEmpty()) {
	   System.out.println("User name should not be Empty");
   }else {
	   System.out.println("The user name is correct");
   }
       String k = "Hello";
       String L=" my Name is Baitullah ";
       System.out.println( k +L);
       System.out.println(L.concat(L));
	}

}
