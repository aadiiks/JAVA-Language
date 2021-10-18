// WAP to check whether a person is eligibile to vote or not.

import java.util.Scanner;
public class Eligibile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else {
            System.out.println("Yor are not eligible to vote.");
        }

    }
}
