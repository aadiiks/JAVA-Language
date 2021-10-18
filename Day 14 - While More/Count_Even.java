// WAP to count all even number and also print their sum.

import java.util.Scanner;
public class Count_Even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while(num!=0){
            if (num % 2 == 0)
            {
                sum = sum+num;
            }
            num--;
        }
        System.out.println("The sum of all even numbers till " + temp + " is: " + sum);
    }
}
