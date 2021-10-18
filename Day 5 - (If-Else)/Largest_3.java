// WAP to print the largest of three numbers.

import java.util.Scanner;
public class Largest_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the third number: ");
        int c = sc.nextInt();
        if ( a == b && b == c) {
            System.out.println("All numbers are equal");
        }
        else if(a > b && a > c) {
            System.out.println("Largest number is: "+a);
        }
        else if(b > c) {
            System.out.println("Largest number is: "+b);
        }
        else {
            System.out.println("Largest number is: "+c);
        }
    }
}