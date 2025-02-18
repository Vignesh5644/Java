package Vignesh.com;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
      int om =sum();
        System.out.println("the sum is = " + om);
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = in.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = in.nextInt();
        int num = num1 + num2;
        return num;
    }
}
