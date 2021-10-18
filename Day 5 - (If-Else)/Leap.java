// WAP to check whether a year is leap or not.

// To determine whether a year is a leap year, follow these steps:

// 1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
// 2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
// 3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
// 4. The year is a leap year (it has 366 days).
// 5. The year is not a leap year (it has 365 days).

import java.util.Scanner;

public class Leap{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int yr = sc.nextInt();
        if (yr % 4 == 0){
            if(yr % 100 == 0){
                if (yr % 400 == 0){
                    System.out.println(yr + " is a leap year.");
                }
                else{
                    System.out.println(yr + " is not a leap year.");
                }
            }
            else{
                System.out.println(yr + " is a leap year.");
            }
        }
        else{
            System.out.println(yr + " is not a leap year.");
        }

    }
}