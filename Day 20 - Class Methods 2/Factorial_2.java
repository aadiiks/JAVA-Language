// WAP to find factorial of any number using TYPE-1

import java.util.Scanner;
public class Factorial_2 {

    public void Fact(int x){
        int temp = x;
        int fact = 1;
        while  (x>0){
            fact = fact * x;
         x--;
        }
        System.out.println("The factorial of " + temp + " is " + fact);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        Factorial_2 fc = new Factorial_2();
        fc.Fact(num);
    }
}
