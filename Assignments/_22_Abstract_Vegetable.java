// WAP to create abstract class vegetable having two abstract methods void color() and void where_grow ().
// Create 2 subclasses mango and potato that will extent the vegetable class.

abstract class Vegetable{
	abstract void color();
	abstract void where_grow();
}

class Potato extends Vegetable{

	void color() {
		System.out.println("The color of Potato is: Brown");
	}
	
	void where_grow() {
		System.out.println("Grows under the land");
	}
	
}
class Mango extends Vegetable{

	void color() {
		System.out.println("The color of Mango is: Yellow");
	}
	
	void where_grow() {
		System.out.println("Grows above the land");
	}
}

public class _22_Abstract_Vegetable {

	public static void main(String args[]) {
		Mango m1 = new Mango();
		m1.color();
		m1.where_grow();
		Potato p1= new Potato();
		p1.color();
		p1.where_grow();
	}
}

// OUTPUT

// The color of Mango is: Yellow
// Grows above the land
// The color of Potato is: Brown
// Grows under the land