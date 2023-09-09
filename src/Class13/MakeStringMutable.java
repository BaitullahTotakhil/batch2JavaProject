package Class13;

public class MakeStringMutable {
	
	
	public static void main(String[] args) {
		
     String khan="Hello my dearest Brother I hope";
     khan=khan.concat(" You doing well");
     System.out.println(khan);
     StringBuilder l=new StringBuilder(khan);
     l.reverse();
     System.out.println(l);
	}

}
