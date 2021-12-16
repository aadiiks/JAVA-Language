// 3) Write a Java Program to find the simple interest taking input through the scanner class.

import java.util.Scanner;
public class _3_Simple_Interest {
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


// OUTPUT

// Enter the Principle : 10000
// Enter the Rate of interest : 4
// Enter the Time period : 5
// The Simple Interest is : 2000.0