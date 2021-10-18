// WAP to check the bigger number between two numbers using TYPE-1

import java.util.Scanner;
public class Bigger_1 {

    public void Biggest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to be compared: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 == num2){
            System.out.println("Both are equal.");
        }
        else if(num1 > num2){
            System.out.println( num1 + " is greater than " + num2);
        }
        else{
            System.out.println( num2 + " is greater than " + num1);
        }
    }
    public static void main(String args[]) {
        Bigger_1 big = new Bigger_1();
        big.Biggest();
    }
}
