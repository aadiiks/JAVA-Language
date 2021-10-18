// WAP to check the bigger number between two numbers using TYPE-3

import java.util.Scanner;
public class Bigger_3 {

    public String Bigger(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers to be compared: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if (num1 > num2){
            return num1+" is biggest.";
        }
        else if(num1 < num2){
            return num2+ " is biggest";
        }
        else{
            return "Both are equal";
        }
    }
    public static void main(String args[]) {
        Bigger_3 big = new Bigger_3();
        System.out.println(big.Bigger());
    }
}
