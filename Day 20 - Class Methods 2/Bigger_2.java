// WAP to check the bigger number between two numbers using TYPE-2

import java.util.Scanner;
public class Bigger_2 {
    
    public void Bigger(int x, int y){
        if (x == y){
            System.out.println("Both are equal.");
        }
        else if(x > y){
            System.out.println( x + " is greater than " + y);
        }
        else{
            System.out.println( y + " is greater than " + x);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to be compared: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Bigger_2 big = new Bigger_2();
        big.Bigger(num1, num2);
    }
}
