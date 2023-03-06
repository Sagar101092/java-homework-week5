package homework;

import java.util.Scanner;

public class InputNumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Input first number: ");
        int a= sc.nextInt();
        String s=String.valueOf(a);
        System.out.print("Input second number: ");
        int b= sc.nextInt();
        String s2=String.valueOf(b);
        System.out.println(s + "X" + s2 + "=" + a*b);
    }
}
