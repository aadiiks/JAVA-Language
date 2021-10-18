// WAP to swap value of two variables without using third variable.

// num1 = num1 + num2
// num2 = num1 - num2
// num1 = num1 - num2
public class Swap_2 {
    public static void main(String args[]) {
        int a = 10, b = 20;
        System.out.println("The original value of a is " + a + " and b is " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The swapped value of a is " + a + " and b is " + b);
    }
}
