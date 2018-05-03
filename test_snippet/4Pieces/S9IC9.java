
public class S9IC9 
{	
	public static String Reverse(String original) 
	{
		String reverse;		
		int length = original.length();
		for(int i = length ; i >= 0 ; i-- )
			reverse += original.charAt(i);
		return reverse;
	}

}
