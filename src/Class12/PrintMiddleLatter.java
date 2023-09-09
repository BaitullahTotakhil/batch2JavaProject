package Class12;

public class PrintMiddleLatter {

	public static void main(String[] args) {
		String Name="Baitullah";
		if(!Name.isEmpty()) {
			if(Name.length()% 2 ==1 && Name.length()>=3) {
				int num=Name.length()/2;
				System.out.println("The middle Char of the word is "+Name.charAt(num));
			}else {
				System.out.println("The word dosnt have middle Char its Even");
			}
		    }else {
			System.out.println("String is empty doest have middle Char");
		    }
		
		

	}

}
