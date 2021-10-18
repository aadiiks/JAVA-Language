public class Overriding_Vehicle_2 extends Overriding_Vehicle_1{
    public void bike(){
        System.out.println("Bike isn't running.");
    }
    public static void main(String args[]) {
        Overriding_Vehicle_2 obj = new Overriding_Vehicle_2();
        obj.bike();
    }
}