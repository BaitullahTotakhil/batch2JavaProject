package Class12;

public class ReplaceDemo {

	public static void main(String[] args) {
     String a = "Hallo";
     a=a.replace('a', 'e');
     System.out.println(a);
     String n ="Jointcore is a tech is school and batch2 is the best";
     System.out.println(n.replace("school","Collage"));
     System.out.println(n.replaceAll(n,"this is replaceAll I have replace all"));
     System.out.println("So Charictar or number that we chose in the box gonna be removed");
     String str2 ="adsfasldkfhaskhf13345";
     str2=str2.replaceAll("[1-9]","");
       System.out.println(str2);
       
	}

}
