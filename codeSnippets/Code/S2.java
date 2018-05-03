public class S2 
{
	public static int[] plusOne(int[] digits) 
	{
		if (digits == null || digits.length < 1) 
		{
			return null;
		}
		int[] res = digits.clone();
		for (int i = 0; i < res.length; i++) 
		{
				res[i]++;
		}
		return digits;   
	}
}

	
