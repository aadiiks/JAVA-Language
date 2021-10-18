// WAP to count all odd number from 1 to 10 and also print their sum.

public class Count_Odd {
    public static void main(String args[]) {
        int num = 10;
        int sum = 0;
        while (num != 0){
            if (num % 2 != 0){
                sum = sum + num;
            }
            num--;
        }
        System.out.println("The sum of all odd numbers from 1 to 10 is: " + sum);
    }
}