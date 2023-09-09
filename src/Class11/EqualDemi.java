    package Class11;

    public class EqualDemi {

	public static void main(String[] args) {
    String s1 ="Hello my Dearst Friend";
    String s2="Hello";
    String s3="Hello";
   System.out.println(s1.equals(s2));
   System.out.println(s2.equals(s3));
   System.out.println(s1.equalsIgnoreCase(s2));
   if(s2.equals(s3)) {
   	System.out.println("tow String are same");
   }else {
   	System.out.println("tow string are not the same");
   }
	}

}
