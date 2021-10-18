// WAP  to find factorial of any number using TYPE-3

import java.util.Scanner;
public class Factorial_3 {
    public String Fact(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int fact = 1;
        while (num>0){
            fact = fact*num;
            num--;
        }
        return "Fact of " + temp + " is " + fact;
    }
    public static void main(String args[]) {
        Factorial_3 fc = new Factorial_3();
        System.out.println(fc.Fact());
    }
}
