// WAP to design a traffic light that takes input as.
// 'r'/'R' -> Red -> Stop
// 'y'/'Y' -> Yellow -> Ready to Go
// 'g'/'G' -> Green -> Go!


import java.util.Scanner;
public class Traffic_Light {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Signal: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'r':
            System.out.println("Stop");
            break;
            case 'y':
            System.out.println("Ready to Go");
            break;
            case 'g':
            System.out.println("Go!");
            break;
            default:
            System.out.println("Wrong Value.");
        }
    }
}
