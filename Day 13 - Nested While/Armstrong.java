// WAP to check whether the entered number is Armstrong number or not.

import java.util.Scanner;
public class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        int temp = num;
        int rem = 0, arm = 0;
        while (num!=0){
            rem = num%10;
            arm = arm + rem * rem * rem;
            num/=10;
        }
        if(temp == arm){
            System.out.println("It's an armstrong number.");
        }
        else{
            System.out.println("It's not an armstrong number.");
        }
    }
}









// import java.util.Scanner;
// public class Armstrong {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter any number: ");
//         int num = sc.nextInt();
//         int temp = num;
//         int rem = 0, digit = 0, total =0;
//         while(num!=0){
//             rem = num%10;
//             digit++;
//             num = num/10;
//         }
//         // System.out.println(digit);
//         num = temp;
//         // System.out.println(num);

//         while (num!=0){
//             rem = num%10;
//             int power = digit;
//             int result = 1;
//             while (power>0){
//                 result = result * rem;
//                 power--;
//             }
//             // System.out.println(result);
//             total = total + result;
//             // System.out.println(total);
//             num /=10;
//         }
//         if(temp == total){
//             System.out.println(("It's an Armstrong Number."));
//         }
//         else{
//             System.out.println("It's not an Armstrong Number.");
//         }


//     }
// }
