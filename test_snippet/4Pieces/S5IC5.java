
public class S5IC5 
{
	public static boolean primeCheck(int k) 
	{
		int temp;
		boolean isPrime=false;		
		for(int i=2;i<=k/2;i++) 
		{
			temp=k%i;
			if(temp==0) 
			{
				isPrime=false;
				break;
			}
			++i;	
		}
		return isPrime;
	}
}
