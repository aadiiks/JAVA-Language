
// WAP  to check whether the entered number is palindrome or not.

import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0, rev = 0;
        while(num!=0){
            rem = num % 10;
            rev = rev * 10 + rem;
            num/=10;
        }
        System.out.println("The reverse of " + temp + " is: " + rev);
        if (temp == rev){
            System.out.println("It's a Palindrome Number.");
        }
        else{
            System.out.println("It's not a Palindrome Number.");
        }
    }
}
