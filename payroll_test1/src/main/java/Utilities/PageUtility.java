package Utilities;

public class PageUtility {
	public static void sleep(int time)
	{
		try
		{
			Thread.sleep(time);
			}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
