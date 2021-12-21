class A extends Thread
{
	public A()
	{
		super("Thread A");
	}

	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
			{
				System.out.println("Thread A" + (i+1));
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}

class B extends Thread
{
	public B()
	{
		super("Thread B");
	}

	public void run()
	{
		try
		{
			for(int j=0; j<10; j++)
			{
				System.out.println("Thread B" + (j+1));
				Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}


class C extends Thread
{
	public C()
	{
		super("Thread C");
	}

	public void run()
	{
		try
		{
			for(int k=0; k<10; k++)
			{
				System.out.println("Thread C" + (k+1));
				Thread.sleep(5000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
	}
}


public class _29_Threads
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();

		a.start();
		b.start();
		c.start();
	}
}