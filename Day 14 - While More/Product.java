// WAP to print product of all digits.

import java.util.Scanner;
public class Product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int digit = 0, total = 1;
        while(num!=0){
            digit = num % 10;
            total = total * digit;
            num/=10;
        } 
        System.out.println("The product of the digits of " + temp + " is: " + total);
    }
}
