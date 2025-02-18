import java.util.Scanner;

public class FirstProgram {
    public static void main (String [] args){
       // System.out.println("Hello World !");
        Scanner in = new Scanner(System.in);
       // System.out.print("Enter some  input :");
       // int rollno = in.nextInt();
       System.out.print("enter some no = " );
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int Sum = num1 + num2;
        System.out.println("sum = " + Sum);

    }
}
