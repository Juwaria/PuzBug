
public class S8IC8 
{
	public static boolean AmstrongNumber(int num) 
	{
		int temp = num;
		int digits = 0;
		int remainder;
		int sum = 0;
		while (temp != 0) 
		{
			digits++;
			temp = temp/10;
		}
		temp = num;
		while (temp != 0) 
		{
			remainder = temp%10;
			sum = sum + power(remainder, digits);	
			temp =/10;		
		}
		if(num == sum)
			return true;
		else
			return false;
	}
	static double power(int n, int r) 
	{
		int c, p = 1;

		for (c = 1; c <= r; c++) 
			p = p*n;

		return p;   
	}
}
