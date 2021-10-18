// WAP  to find factorial of any number using TYPE-1

import java.util.Scanner;
public class Factorial_1 {
    public void Fact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int fact = 1;
        while (num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("The factorial of " + temp + " is " + fact);
    }
    public static void main(String args[]) {
        Factorial_1 fc = new Factorial_1();
        fc.Fact();
    }
}
