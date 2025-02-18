import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int Count = 2;
        while (Count  <= n){
            int temp = b;
            b = b + a;
            a = temp;
            Count ++ ;
        }
        System.out.println(b);
    }
}
