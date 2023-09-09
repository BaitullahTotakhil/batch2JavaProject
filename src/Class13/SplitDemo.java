package Class13;

public class SplitDemo {

	public static void main(String[] args) {
    String str="I need to count the letters of the Array";
    String []i=str.split("");
          //So if i give space to after the split it will pick the words after space;
     //if you don,t give space it will get all the work in the sentences;
     System.out.println(i.length);
	}

}
