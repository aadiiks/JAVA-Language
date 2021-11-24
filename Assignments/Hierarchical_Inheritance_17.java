// WAP to create a class vehicle that stores no. of wheels & speed.
// Create the following derived classses.
//      Create a class Car that inherits vehicle & also stores the number of passengers.
//      Create a class truck that inherits the vehicle & also stores the load limits.
//      Write a main class to create the object of these 3 classes & display all information about car & truck.

public class Hierarchical_Inheritance_17 {
    public static void main(String args[]) {
        vehicle V = new vehicle();
        car c = new car();
        Truck t = new Truck();
        V.print();
        c.print1();
        t.print2();
    }
}
class vehicle{
    int Wheels = 4, speeds = 50;
    public void print(){
        System.out.println("No.of wheels is : " + Wheels);
        System.out.println("Speed is : " + speeds);
    }
}
class car extends vehicle{
    int Passengers = 10;
    public void print1() {
        System.out.println("No.of Passenger is : " + Passengers);
    }
}
class Truck extends vehicle{
    int loadlimits = 23;
    public void print2() {
        System.out.println("No.of Load_limit is : " + loadlimits);
    }
}