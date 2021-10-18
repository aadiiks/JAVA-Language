public class Child extends Parent{
    public static void main(String args[]) {
        Child obj = new Child();
        System.out.println("Father's Name: " + obj.name);
        System.out.println("Age is: " + obj.age);
        obj.Greet();

    }
}


// In this code we learned to call a method and attributes seperately from the parent class using inheritance.