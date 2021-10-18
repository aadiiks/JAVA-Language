// WAP to design a calculator having Percentage calculator, EMI calculator and Arithmetic calculator.

import java.util.Scanner;
public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Percentage Calculator\n2. EMI Calculator\n3. Arithmetic Calculator");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter your marks in 3 subjects: ");
                int s1 = sc.nextInt();
                int s2 = sc.nextInt();
                int s3 = sc.nextInt();
                double per = (s1+s2+s3)/3;
                System.out.println("The percentage is: " + per);
            break;

            case 2:
                System.out.println("Enter the principal amount, rate of interest and month(s): ");
                int pri = sc.nextInt();
                int roi = sc.nextInt();
                int month = sc.nextInt();
                double iopri = roi*pri/100;
                double total_cost = pri + iopri;
                double emi = total_cost / month;
                System.out.println("Your EMI is: " + emi);
            break;    

            case 3:
                System.out.println("Enter any 2 numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                int sum = num1 + num2;
                int sub = num1 - num2;
                int prod = num1 * num2;
                int div = num1 / num2;
                System.out.println("Sum is: " + sum);
                System.out.println("Subtraction is: " + sub);
                System.out.println("Product is: " + prod);
                System.out.println("Division is: " + div);
            break;

            default:
                System.out.println("Invalid Input. Please try again.");
                break;
        }
    }
}