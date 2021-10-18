// WAP to print electricity bill according to the following slab:
// if
// units <= 50 -> Rs. 0.50/-
// units <= 100 -> Rs. 0.75/-
// units <= 150 -> Rs. 1.20/-
// units <= 250 -> Rs. 1.50/-

import java.util.Scanner;

public class Electric_Bill{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your units consumed: ");
        int units = sc.nextInt();
        double charge=1;
        if(units<=50){
            charge = units*0.50;
            System.out.println("Your Bill Charge is : " + charge);
        }
        else if(units<=100){
            charge = units*0.75;
            System.out.println("Your Bill Charge is : " + charge);
        }
        else if(units<=150){
            charge = units*1.20;
            System.out.println("Your Bill Charge is : " + charge);
        }
        else{
            charge = units*1.50;
            System.out.println("Your Bill Charge is : " + charge);
        }
        double xtra = charge*0.2;
        double total_charge = charge + xtra;
        System.out.println("Total amount to be paid is : " + total_charge);
    }
}