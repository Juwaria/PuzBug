
public class S12IC12 
{
	static int sum = 0;
	public static int sum(int n) 
	{
		sum = sum + sum(n-1);	
		return sum;
	}
}
