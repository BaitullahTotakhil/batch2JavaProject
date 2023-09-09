package ReviewClass4;

public class Practice {

	public static void main(String[] args) {
     String UserName="khan";
     String Password= "aabb123";
     String confirmation="aabb123";
     
     if (UserName.isEmpty()||Password.isEmpty()) {
    	 System.out.println("UserName and Password cannot be Empty");
     }else if (Password.length()<=8) {
    	 System.out.println("The password is too Short");
     }else if(Password.contains(UserName)) {
    	 System.out.println("Password can not contain UserName");
     }else if(!Password.equals(confirmation)) {
    	 System.out.println("Password doesnt match");
     }else {
    	 System.out.println("UserName and password has successfully created");
    	 
     }
	}

}
