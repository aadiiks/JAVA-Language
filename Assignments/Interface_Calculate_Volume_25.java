// WAP to define an interface shape and calculate the volume of sphere and cone using interface shape.

interface shape
{
	void volume();
	public static final float pi = 3.14f; 
}

class sphere implements shape
{
	int r = 5;
	public void volume()
	{
		System.out.println("Volume of sphere is: " + ((4/3)* pi * r * r * r));
	}
}

class cone implements shape
{
	int r = 5;
	int h = 10;
	public void volume()
	{
		System.out.println("Volume of sphere is: " +(pi * r * r * h)/3);
	}
}

public class Interface_Calculate_Volume_25 {
	public static void main(String args[])
	{
		sphere s = new sphere();
		cone c = new cone();
		s.volume();
		c.volume();
		 
	}
}


// OUTPUT

// Volume of sphere is: 392.5
// Volume of sphere is: 261.66666