// WAP to add 2 numbers using java class methods with return and with arguments.

import java.util.Scanner;
public class Method_4 {

    public int add(int x, int y){
        return x+y;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("Enter any 2 numbers: "));
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Method_4 obj = new Method_4();
        System.out.println("The sum is: " + obj.add(num1, num2));
    }
}
