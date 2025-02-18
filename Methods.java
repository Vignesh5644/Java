package Vignesh.com;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.next();
        String personalised = Greet(name);
        System.out.println(personalised);
    }
    static String Greet(String name){
        String ok = "Hello " + name;
        return ok;
    }
}
