   package ReviewClass4;

   public class ReplacePractice {
	
	public static void main(String[] args) {
		String num="lkjhjkjhk2342345 90909)*&)*&%(*)(*&";
		System.out.println(num.replaceAll("[^0-9]", ""));
		System.out.println(num.replaceAll("[^A-Z-a-z]", ""));
		
		String name ="AFGHANISTAN";
		String p="kabul Afghanistan";
		System.out.println(name.toLowerCase());
		System.out.println(p.toUpperCase());
		System.out.println(name.length());
		
		for(int j=name.length()-1;j>=0;j--) {
			System.out.print(name.charAt(j));
		}
        char []kk=p.toCharArray();
        System.out.println();
        for(int m=kk.length-1;m>=0;m--) {
        	System.out.print(kk[m]);
        }
	}

}
