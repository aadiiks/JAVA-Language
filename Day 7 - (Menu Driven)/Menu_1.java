// WAP to design a simple menu card with food items and costs using if-else menu driven.

import java.util.Scanner;
public class Menu_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your dish:\n1. Bread Cutlet\n2. Black Coffee\n3. Cold Drink\n4. Pasta\n5. Water");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice == 1){
            System.out.println("You ordered Bread Cutlet");
        }
        else if (choice == 2){
            System.out.println("You ordered Black Coffee");
        }
        else if (choice == 3){
            System.out.println("You ordered Cold Drink");
        }
        else if (choice == 4){
            System.out.println("You ordered Pasta");
        }
        else if (choice == 5){
            System.out.println("You ordered Water");
        }
        else {
            System.out.println("Wrong input. Please try again.");
        }
    }
}
