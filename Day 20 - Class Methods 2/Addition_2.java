// WAP to add two numbers using TYPE-2 method taking user inputs.

import java.util.Scanner;
public class Addition_2 {
    
    public void add(int x, int y){
        System.out.println("The sum is: " + (x+y));
    }

    public static void main(String args[]) {
        Addition_2 obj = new Addition_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        obj.add(num1, num2);
    }
}
