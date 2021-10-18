// WAP to design the following pattern.

// a a a a a
// b b b b b
// c c c c c
// d d d d d
// e e e e e

public class Pattern_3 {
    public static void main(String args[]) {
        for(char i = 'a'; i <= 'e'; i++){
            for(char j = 'a'; j <= 'e'; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}