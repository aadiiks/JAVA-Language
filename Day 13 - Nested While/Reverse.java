// WAP  to print the reverse of the entered number.

import java.util.Scanner;
public class Reverse {
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
    }
}
