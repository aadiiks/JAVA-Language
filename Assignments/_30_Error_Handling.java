// Exception Handling

public class _30_Error_Handling 
{
	public static void main(String args[])
	{
		int a[] = {5,10};
		int b = 5;
		
		try
		{	
			int x = a[2]/(b-a[1]);
		}

		catch (ArithmeticException e)
		{
			System.out.println("Divided by zero.");	
		}

		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound.");
		}

		catch (ArrayStoreException e)
		{
			System.out.println("Wrong data type.");			
		}
		
		finally
		{
			int y = a[1]/b;
			System.out.println("y= " + y);
		}


	}
}