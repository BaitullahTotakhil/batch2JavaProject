package Class15;
public class MethodePractice {
    int num = 5;
    int num1 = 10;
    public  void addition(){
        System.out.println("The Addition of this two numbers is" + (num1+num));
    }
    public static void main (String []args){

        MethodePractice Obj =new MethodePractice();
        Obj.addition();
        Obj.addition();

}

}

