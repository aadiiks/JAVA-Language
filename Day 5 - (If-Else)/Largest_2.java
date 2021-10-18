// WAP to print the largest of two numbers.

import java.util.Scanner;

public class Largest_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        if(a == b) {
            System.out.println("Both numbers are equal.");
        }
        else if (a>b){
            System.out.println("Largest number is: " + a);
        }
        else {
            System.out.println("Largest number is: " + b);
        }
    }
}