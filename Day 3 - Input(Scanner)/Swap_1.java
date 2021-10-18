// WAP to program to input two number and swap their value using third variable.

import java.util.Scanner;
public class Swap_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the two values: ");
        System.out.print("Value for a: ");
        int a = sc.nextInt();
        System.out.print("Value for b: ");
        int b = sc.nextInt();
        System.out.println("The original value of a is " + a + " and b is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped value of a is " + a + " and b is " + b);
    }
}