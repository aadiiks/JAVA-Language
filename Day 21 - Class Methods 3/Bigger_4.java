// WAP to check the bigger number between two numbers using TYPE-4

import java.util.Scanner;
public class Bigger_4 {
    
    public String Bigger(int x, int y){
        if (x == y){
            return "Both are equal.";
        }
        else if(x > y){
            return x + " is greater than " + y;
        }
        else{
            return y + " is greater than " + x;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to be compared: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Bigger_4 big = new Bigger_4();
        System.out.println(big.Bigger(num1, num2));
    }
}