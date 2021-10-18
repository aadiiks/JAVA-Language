// WAP to input the product name, cost of that product and the quantity by user and print the total cost to be paid.

import java.util.Scanner;
public class Shopping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product name: ");
        String product = sc.nextLine();
        System.out.print("Enter the product quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter the product price: ");
        double price = sc.nextDouble();

        System.out.println("Your total cost of buying " + quantity + " " + product + " is Rs " + (quantity*price));
        System.out.println("Thanks For Your Purchase");
    }    
}
