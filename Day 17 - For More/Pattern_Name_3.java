// WAP to print any entered name in the following pattern.

// N
// N A
// N A M
// N A M E
// N A M E  I
// N A M E  I S
// N A M E  I S  T
// N A M E  I S  T H
// N A M E  I S  T H I
// N A M E  I S  T H I S

import java.util.Scanner;
public class Pattern_Name_3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String name = sc.nextLine();
        int ch = name.length();
        for(int i = 0; i < ch; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(name.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
