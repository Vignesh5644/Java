import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

   /*Syntax of for loops
       for (initialization; condition; increment/decrement ) {
       // body
       }
  */
        //for (int num = 1; num <= 5; num += 1) {
         //   System.out.println(num);
        //}

        //print numbers from 1 to n
        Scanner in = new Scanner(System.in);
       // int num = in.nextInt();
       // for (int i = 1; i <= num ; i +=1 ) {
      //      System.out.print(i + " ");
      //  }

        // Find the largest of the three numbers
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

       /* int max = a;
        if (b>max){
            max = b;
        } if (c>max){
            max = c;
        }*/

        //Another optimized way to solve above

        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}