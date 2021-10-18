// WAP to draw 3 different types of lines with a java class methods using public methods(also known as functions.)


// This code is of Type 1.
public class Lines_2 {
    public void draw_line(){  //Methods declaration and defination
        System.out.println("________________________________________");
    }
    public void draw_dotted(){
        System.out.println("........................................");
    }
    public void draw_dashed(){
        System.out.println("----------------------------------------");
    }
    
    public static void main(String args[]) {
        Lines_2 draw = new Lines_2();   // Create an object of Main i.e. Lines_2
        draw.draw_line();    // Call the public method on the object.
        draw.draw_dotted();  //Function calling i.e. methods calling.
        draw.draw_dashed();
    }
}


// We will often see Java programs that have either static or public attributes and methods.

// In the example above, we created a static method, which means that it can be accessed without creating an object of the class, unlike public, which can only be accessed by objects:

