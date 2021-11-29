// 4) Write a Java Program to find out whether a number is positive or negative taking input through the scanner class.

import java.util.Scanner;
public class Positive_or_Negative_4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked: ");
        double num = sc.nextDouble();      
        if(num>0)  
        {  
            System.out.println("The number is positive.");  
        }  
        else if(num<0)  
        {  
            System.out.println("The number is negative.");  
        }  
        else  
        {  
            System.out.println("The number is zero.");  
        }  
    }
    
}


// OUTPUT

// Enter the number to be checked: 
// 26
// The number is positive.