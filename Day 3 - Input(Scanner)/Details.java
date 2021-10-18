// WAP to print your details on output screen after inputs from user.

import java.util.Scanner;
public class Details {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your height: ");
        int hgt = sc.nextInt();
        System.out.println("Hey, " + name + ". Your age is " + age + " yrs and your height is " + hgt + " cms.");
    }
}
