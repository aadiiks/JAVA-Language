// 1) Write a Java Program to wish “Good Morning”, “Good Afternoon”, and “Good Evening” according to the time input by the user using scanner class.(Use 24 hour time format)

import java.util.Scanner;
public class PCA1_Wishing_1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hh of hh/mm/ss in 24 hours format: ");
        int hours = sc.nextInt();
        if (hours>=0 && hours<12 || hours==24){
            System.out.println("Good Morning");
        } else if (hours>=12 && hours<18){
            System.out.println("Good Afternoon");
        } else if (hours>=18 && hours<24){
            System.out.println("Good Evening");
        } else {
            System.out.println("Invalid Input");
        }
    }
}


// OUTPUT

// Enter the hh of hh/mm/ss in 24 hours format: 16
// Good Afternoon