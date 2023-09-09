package ReviewClass3;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] num = new int [3];
		
		num[0]=1;
		num[1]=3;
		num[2]=9;
		//System.out.println(num[0]);
		for (int n:num) {
			System.out.println(n);
		}
		System.out.println();
		String []Countries={"USA", "Ausralia","Afghasistan "};
		for(int i=0;i<Countries.length;i++) {
			System.out.print(Countries[i]+" ");
		}
		System.out.println();

		for (String b:Countries) {
			System.out.println(b);
		}
		}
	}


