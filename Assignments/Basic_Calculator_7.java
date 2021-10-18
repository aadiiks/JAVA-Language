// Write a Java Program to implement the basic calculator operations using scanner class.

import java.util.Scanner;
public class Basic_Calculator_7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double ans;
        char op;
        System.out.println("Enter two numbers: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
        switch(op) {
            case '+': ans = num1 + num2;
                break;
            case '-': ans = num1 - num2;
                break;
            case '*': ans = num1 * num2;
                break;
            case '/': ans = num1 / num2;
                break;
        default: System.out.printf("Error! Enter correct operator");
            return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.print(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
