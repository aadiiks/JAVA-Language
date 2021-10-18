// If you don't want the ability to override existing values, declare attributes as "final".

public class Final_intro {
    final int x = 10;
    final double PI = 3.14;

    public static void main(String args[]) {
        Final_intro myObj = new Final_intro();
        myObj.x = 50;   // Will generate an error: cannot assign value to a final variable.
        myObj.PI = 25;  // Will generate an error: cannot assign value to a final variable.
        System.out.println(myObj.x);
    }
}
