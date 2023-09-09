package Class9;

public class AdvanceLOOP {

	public static void main(String[] args) {
    
	int []num= {34,67,34,67,23,};
	for(int i:num) {
		System.out.print(i+" ");
	}
	System.out.println();
		String [] names = {"Rahan","Omar","Aisha","Asma"};
		
		for(int n=0; n<names.length;n++) {
			System.out.print(names[n]+"  ");
		}
	System.out.println();
	
	for(String n:names) {
		System.out.print(n+" ");
	}
	
	}
	
}
