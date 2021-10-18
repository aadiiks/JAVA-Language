// WAP to print the reverse of a given number.

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int fact = 1;
        while (num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("The factorial of " + temp + " is " + fact);
    }
}