// WAP to calculate addition, substraction, multiplication and division using class methods. TYPE-1

import java.util.Scanner;
public class Arithemetic {

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The sum is: " + (num1 + num2));
    }
    public void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The difference is: " + (num1 - num2));
    }
    public void prod(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The Product is: " + (num1 * num2));
    }
    public void div(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("The division is: " + (num1 / num2));
    }
    public static void main(String args[]) {
        Arithemetic math=new Arithemetic();
        math.add();
        math.sub();
        math.prod();
        math.div();
    }
}
