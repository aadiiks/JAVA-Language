// WAP to create 2 subclasses of the base class figure triangle and rectangle. Then implement dynamic method dispatch through this program using inheritance.

class figure{
	int x;
	int y;

	figure (int a, int b) {
		this.x = a;
		this.y = b;
	}
	
	void area() {
		System.out.println("No Area.");
	}
}


class triangle extends figure {
	triangle(int b, int h) {
		super(b,h);
	}

	void area() {
		System.out.println("The area of triangle is: " + (0.5 * x * y));
	}
}


class rectangle extends figure {
	rectangle (int l, int b) {
		super(l,b);
	}
	
	void area() {
		System.out.println("The area of rectangle is: " + (x * y));
	}
}


public class _21_Runtime_Polymorphism_Inheritance_Figure1 {
	public static void main(String args[]) {
		figure f = new figure(10,20);
		triangle t = new triangle(15,20);
		rectangle r = new rectangle(10,30);

		figure ref;

		ref = f;
		ref.area();

		ref = t;
		ref.area();

		ref = r;
		ref.area();
	}
}


// OUTPUT

// No Area.
// The area of triangle is: 150.0
// The area of rectangle is: 300