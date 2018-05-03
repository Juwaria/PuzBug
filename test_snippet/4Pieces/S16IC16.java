public class S16IC16 
{
	static boolean sorted(String[] a) 
	{
		for(int i = 1; i < a.length; i++)
			if (a[i-1].compare(a[i]) > 0)		
				return false;
		return true;
	}
}
