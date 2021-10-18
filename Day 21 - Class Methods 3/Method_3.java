import java.util.Scanner;

// WAP to add 2 numbers using Java class methods with return and without arguments.

import java.util.Scanner;
public class Method_3 {
    
    public int add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return num1 + num2;
    }
    public static void main(String args[]) {
        Method_3 obj=new Method_3();
        int res = obj.add();
        System.out.println("The sum is: " + res);
        // For the above two lines we can do.
        // System.out.println("The sum is: " + obj.add());
    }
}
