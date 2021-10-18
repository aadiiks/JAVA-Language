// WAP to draw 3 different types of lines with a java class methods using static methods(also known as functions.)


// This code is of Type 1.
public class Lines_1 {
    static void draw_line(){  //Methods declaration and defination
        System.out.println("________________________________________");
    }
    static void draw_dotted(){
        System.out.println("........................................");
    }
    static void draw_dashed(){
        System.out.println("----------------------------------------");
    }
    
    public static void main(String args[]) {
        draw_line();    //Function calling i.e. methods calling
        draw_dotted();
        draw_dashed();
    }
}


// We will often see Java programs that have either static or public attributes and methods.

// In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects: