// WAP to print sum of all digits.

import java.util.Scanner;
public class Sum{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int total = 0, digit = 0;
        while (num!=0){
            digit = num % 10;
            total = total + digit;
            num/=10;
        }
        System.out.println("The sum of digits of " + temp + " is: " + total);
    }
}