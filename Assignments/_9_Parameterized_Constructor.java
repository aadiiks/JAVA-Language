// 9) Write a Java Program to implement the concept of Parameterized Constructor. 

class Test{
    int x,y;
    Test(int a, int b){
        x = a;
        y = b;
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("Parameterised constructor Invoked.");
    }
}
public class _9_Parameterized_Constructor {
    public static void main(String args[]) {
        Test t = new Test(10, 20);
    }
}


// OUTPUT

// x: 10
// y: 20
// Parameterised constructor Invoked.