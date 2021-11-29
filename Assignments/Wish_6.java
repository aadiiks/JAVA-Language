// 6) WAP Write a Java Program to wish “Good Morning”, “Good Afternoon”, and “Good Evening” according to the time input by the user using scanner class.

import java.util.Scanner;
public class Wish_6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hh of hh/mm/ss in 24 hours format: ");
        int hours = sc.nextInt();
        
        if(hours>=1 && hours<=12){
            System.out.println("Good Morning");
        } else if(hours>=12 && hours<=16){
            System.out.println("Good Afternoon");
        } else if(hours>=16 && hours<=21){
            System.out.println("Good Evening");
        } else if(hours>=21 && hours<=24){
            System.out.println("Good Night");
        }
    }
}

// OUTPUT

// Enter the hh of hh/mm/ss in 24 hours format: 9
// Good Morning