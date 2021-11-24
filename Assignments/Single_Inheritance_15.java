// WAP to create a base class B and print the values of two variables i & j in that class and then create a derived class that inherits the previous base class and print the sum of i,j&k in that derived class.


class B {
    int i;
    int j;
    void sum_of_2(){
        System.out.println("The sum of i & j is: " + (i+j));
    }
}

class A extends B {
    int k;
    void sum_of_3(){
        System.out.println("The sum of i, j & k is: " + (i+j+k));
    }
}

public class Single_Inheritance_15 {
    public static void main(String args[]) {
        B b=new B();
        A a=new A();

        b.i=10;
        b.j=20;
        b.sum_of_2();
        
        a.i=10;
        a.j=20;
        a.k=30;
        a.sum_of_3();

    }
}
