// WAP to swap values of two variable using third variable.

public class Swap_1{
    public static void main(String args[]) {
        int a = 10, b = 20;
        int temp;
        System.out.println("The original value of a is " + a + " and b is " + b);
        temp = b;
        b = a;
        a = temp;
        System.out.println("The swapped value of a is " + a + " and b is " + b);
    }
}