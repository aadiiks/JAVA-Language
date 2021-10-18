// WAP to take input 5 students name with their marks in C, Java and Python and print their total marks obtained with the percentage obtained.

// Here due to exception we need to place extra sc.nextLine() before every new student entry to remove the extra newline statement.

import java.util.Scanner;
public class Result {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********Result Calculator**********");
        System.out.println("Enter the name of the Students with their marks in C Java and Python respectively:");
        System.out.println("For 1st Student: ");
        String s1 = sc.nextLine();
        int c1 = sc.nextInt();
        int java1 = sc.nextInt();
        int py1 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("For 2nd Student: ");
        String s2 = sc.nextLine();
        int c2 = sc.nextInt();
        int java2 = sc.nextInt();
        int py2 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("For 3rd Student: ");
        String s3 = sc.nextLine();
        int c3 = sc.nextInt();
        int java3 = sc.nextInt();
        int py3 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("For 4th Student: ");
        String s4 = sc.nextLine();
        int c4 = sc.nextInt();
        int java4 = sc.nextInt();
        int py4 = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("For 5th Student: ");
        String s5 = sc.nextLine();
        int c5 = sc.nextInt();
        int java5 = sc.nextInt();
        int py5 = sc.nextInt();

       

        System.out.println("********************************************************************************");
        System.out.println("                             Result Dashboard");
        System.out.println("                             Session 2020-21");
        System.out.println("********************************************************************************");

        System.out.println("Student's Name\tC\tJAVA\tPYTHON\tTOTAL\tPercentage");
        System.out.println("    "+s1+"\t"+c1+"\t "+java1+"\t  "+py1+"\t "+(c1+java1+py1)+"\t   "+((c1+java1+py1)/3)+"%");
        System.out.println("    "+s2+"\t"+c2+"\t "+java2+"\t  "+py2+"\t "+(c2+java2+py2)+"\t   "+((c2+java2+py2)/3)+"%");
        System.out.println("    "+s3+"\t"+c3+"\t "+java3+"\t  "+py3+"\t "+(c3+java3+py3)+"\t   "+((c3+java3+py3)/3)+"%");
        System.out.println("    "+s4+"\t"+c4+"\t "+java4+"\t  "+py4+"\t "+(c4+java4+py4)+"\t   "+((c4+java4+py4)/3)+"%");
        System.out.println("    "+s5+"\t"+c5+"\t "+java5+"\t  "+py5+"\t "+(c5+java5+py5)+"\t   "+((c5+java5+py5)/3)+"%");
        
    }
}