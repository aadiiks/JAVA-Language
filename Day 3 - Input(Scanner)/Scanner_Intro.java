// WAP to take input two numbers from user and print the sum of it.

import java.util.Scanner;
public class Scanner_Intro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.print("The sum of the two numbers is: " + (num1 + num2));
        sc.close();
    }
    
}

// Import is used a java which is not in the list of the java main package.
// java.util.Scanner;   here java is package name, util is sub-package name and Scanner is the class name which we need to take input.
// Scanner sc = new Scanner(System.in);
// Here Scanner is the class name which we need to use. This is type of calling.
// sc is the obj name for scanner which can we anything that we want to name it as.
// new is a keyword use to allocate an address in the memory for sc to store the values.
// Then Scanner is passed as method with parenthesis for taking arguments.
// System.in is the function we use to take input in java as we use System.out for output.
// nextInt() for integer input.
// nextDouble() for double input.
// nextFloat() for float input.
// nextLine() for string input.
// sc.close() states that the obj we made earlier cannot be used further.
