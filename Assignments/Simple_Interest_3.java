// Write a Java Program to find the simple interest taking input through the scanner class.

import java.util.Scanner;
public class Simple_Interest_3{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle : ");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate of interest : ");
        double r = sc.nextDouble();
        System.out.print("Enter the Time period : ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.print("The Simple Interest is : " + si);
    }
}
