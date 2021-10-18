// WAP to check whether the entered character is vowel or not.

import java.util.Scanner;
public class Vowel {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a':
            System.out.println("It is a vowel.");
            break;
            case 'e':
            System.out.println("It is a vowel.");
            break;
            case 'i':
            System.out.println("It is a vowel.");
            break;
            case 'o':
            System.out.println("It is a vowel.");
            break;
            case 'u':
            System.out.println("It is a vowel.");
            break;
            default:
            System.out.println("It is not a vowel");
        }
    }    
}
