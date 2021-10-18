// WAP to program to input two number and swap their value without using third variable.

import java.util.Scanner;
public class Swap_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter your 2nd number: ");
        int b = sc.nextInt();
        System.out.println("The original value of a is " + a + " and b is " + b);
        a = a + b;
        b = a - b;
        a = a - b; 
        System.out.println("The swapped value of a is " + a + " and b is " + b);
    }
}
