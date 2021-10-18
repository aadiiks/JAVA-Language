// WAP to check whether the entered number is Krishnamurthy Number.

import java.util.Scanner;
public class Krishnamurthy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0, strong = 0;
        while(num!=0){
            int i = 1;
            int fact = 1;
            rem = num % 10;
            while(i<=rem){
                fact = fact*i;
                i++;
            }
            strong = strong + fact;
            num /= 10;
        }
        if(temp == strong){
            System.out.println("Strong Number.");
        }
        else{
            System.out.println("Not a Strong Number.");
        }
        
    }
}
