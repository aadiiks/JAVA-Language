package P1;

public class fact
{
	public void f(int n)
	{

		int f =1;
		if (n==0)
		{
			f=1;
		}
		else 
		{
			for (int i = 1; i<=n; i++)
			{
				f = f * i;
			}
			System.out.println("Factorial is: " + f);
		}
	}
}