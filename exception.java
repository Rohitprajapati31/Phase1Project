package mypackage;

public class exception 
{
	public static void main(String[] args)
	{
		int i = 1;
		try
		{
			System.out.println("Division of " + i/0);
		}
		catch(Exception e)
		{
			System.out.println("Divide by zero error occurs.");
		}
//		System.out.println("Division of " + i/0);
	}
}
