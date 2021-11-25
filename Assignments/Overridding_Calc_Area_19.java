// WAP to create a class circle having one data member radius & method get area and return the area of the circle.
// Create another class cylinder of superclass circle to return the lateral surface area of cylinder.

import java.util.Scanner;

class Circle{
    double radius;
    Circle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        radius = sc.nextDouble();
    }

    void get_area(){
        double area;
        area = 3.14 * radius * radius;
        System.out.println("Area of circle is: " + area);
    }
}

class Cylinder extends Circle{
    double height;
    Cylinder(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height: ");
        height = sc.nextDouble();
    }

    void get_area(){
        double area;
        area = 3.14 * radius * radius * height;
        System.out.print("Area of Cylinder is: " + area);
    }
}

public class Overridding_Calc_Area_19 {
    public static void main(String args[]) {
        System.out.println("Enter the Details of Circle.");
        Circle c1 = new Circle();
        System.out.println("Enter the Details of Cylinder.");
        Cylinder c2 = new Cylinder();

        c1.get_area();
        c2.get_area();
    }    
}
