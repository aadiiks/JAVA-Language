// WAP to check the input character is alphabet, number or special character.

import java.util.Scanner;
public class Alphacheck {
    public static void main(String[] args) {
        System.out.println("Enter any character: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
        {
            System.out.println("Alphabet.");
        }
        else if (ch>='0' && ch<='9')
        {
            System.out.println("Number");
        }
        else 
        {
            System.out.println("Special Character.");
        }
    }
}


// Here in char ch = sc.next().charAt(0);

// char allows us to take a character input.
// next() takes the word or character entered by the user.
// charAt(0) takes the character at the index zero if a string of group of characters are entered by user.
