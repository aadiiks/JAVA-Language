// WAP to check whether the entered character is vowel or consonant.

import java.util.Scanner;
 
public class Vowel_Consonant{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter an Alphabet : ");
        char ch = sc.next().charAt(0);
 
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.print(ch+" is a Vowel");
        }
        else{
            System.out.print(ch+ " is a Consonant");
        }
    }
}