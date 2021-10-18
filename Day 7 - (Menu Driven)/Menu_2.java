// WAP to design a simple calculator having option of Addition, Subtraction, Division and Multiplication using if-else menu driven.

import java.util.Scanner;
public class Menu_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choices for:\n1. Addition\n2. Substraction\n3. Division\n4. Multiplication");
        System.out.print("Enter you Choice: ");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Addition Section:");
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("The sum of the numbers is: " + (a+b));
        }
        else if (choice == 2){
            System.out.println("Substraction Section:");
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("The difference between the numbers is: " + (a-b));
        }
        else if (choice == 3){
            System.out.println("Division Section:");
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("The division of the numbers is: " + (a/b));
        }
        else if (choice == 4){
            System.out.println("Multiplication Section:");
            System.out.print("Enter 1st number: ");
            int a = sc.nextInt();
            System.out.print("Enter 2nd number: ");
            int b = sc.nextInt();
            System.out.println("The product of the numbers is: " + (a*b));
        }
        else{
            System.out.println("Wrong Input. Please try again.");
        }
    }
}
