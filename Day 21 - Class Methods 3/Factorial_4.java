// WAP  to find factorial of any number using TYPE-4

import java.util.Scanner;
public class Factorial_4 {
    public String Fact(int x){
        int temp = x;
        int fact = 1;
        while (x>0){
            fact = fact*x;
            x--;
        }
        return "Fact of " + temp + " is " + fact;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        Factorial_4 fc = new Factorial_4();
        System.out.println(fc.Fact(num));
    }
}

