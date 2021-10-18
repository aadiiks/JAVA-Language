// WAP to create salary by the following assignment.

import java.util.Scanner;

public class Salary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Grade:  [A / B] : ");
        char grd = sc.next().charAt(0);
        System.out.println("Enter your experience [2 / 3] : ");
        int exp = sc.nextInt();

        if(grd=='B' || grd=='b'){
            if(exp==2){
                System.out.println("Your salary is : Rs. 15,000/-");
            }
            else if(exp == 3){
                System.out.println("Your salary is : Rs. 20,000/-");
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else if(grd=='A' || grd=='a'){
            if(exp==2){
                System.out.println("Your salary is : Rs. 40,000/-");
            }
            else if(exp == 3){
                System.out.println("Your salary is : Rs. 60,000/-");
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        else {
            System.out.println("Invalid Input.");
        }
    }
}
