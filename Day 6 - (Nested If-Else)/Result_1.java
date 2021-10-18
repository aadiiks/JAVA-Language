// WAP to find out the grade of a student when the marks of 5 subjects are given.
// The method of assigning grade is:
// percentage >= 85                         Grade = A
// percentage < 85 and percentage >= 70     Grade = B
// percentage < 70 and percentage >= 55     Grade = C
// percentage < 55 and percentage >= 40     Grade = D
// percentage < 40                          Grade = FAIL

import java.util.Scanner;
public class Result_2 {
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
            System.out.println("Grade A");
        }
        else if (per >= 85){
            System.out.println("Grade B");
        }
        else if (per >= 55){
            System.out.println("Grade C");
        }
        else if (per >= 40){
            System.out.println("Grade D");
        }
        else{
            System.out.print("FAIL");
        }

    }
}
