//  WAP to find the remarks on the basics of grade.
// The method of assigning grade is:-
// 'A' grade -> "EXCELLENT"
// 'B' grade -> "GOOD"
// 'C' grade -> "AVERAGE"
// 'D' grade -> "WORK HARD"


import java.util.Scanner;
public class Result_3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of the student wth marks in C, Java and Python.");
        String name = sc.nextLine();
        int c = sc.nextInt();
        int java = sc.nextInt();
        int py = sc.nextInt();
        int total = (c+java+py);
        int per = (total)/2;

        System.out.println(name + " scored " + total + " out of 300.");
        if (per >= 85){
            System.out.println(" Grade A - EXCELLENT");
        }
        else if (per >= 85){
            System.out.println("Grade B - GOOD");
        }
        else if (per >= 55){
            System.out.println("Grade C - AVERAGE");
        }
        else{
            System.out.println("Grade D - WORK HARD");
        }
    }
}
