// WAP to accept 2 different matrices from the user and print their addition.

import java.util.Scanner;
public class Matrix_2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of 1st Matrix:");
        System.out.print("Enter the no. of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int b = sc.nextInt();

        System.out.println("Enter the 1st " + a + " x " + b + " matrix: ");
        int Mat1[][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                Mat1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the 2nd " + a + " x " + b + " matrix: ");
        int Mat2[][] = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                Mat2[i][j] = sc.nextInt();
            }
        }

        System.out.println("The resultant added matrix is: ");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                System.out.print((Mat1[i][j]+Mat2[i][j]) + " ");
            }
            System.out.println();
        }
    }
}
