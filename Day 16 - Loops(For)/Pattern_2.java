// WAP to design the following pattern.

// a b c d e
// a b c d e
// a b c d e
// a b c d e
// a b c d e

public class Pattern_2 {
    public static void main(String args[]) {
        for(char i = 'a'; i <= 'e'; i++){
            for(char j = 'a'; j <= 'e'; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
