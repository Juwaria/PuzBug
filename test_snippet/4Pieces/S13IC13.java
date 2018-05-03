
public class S13IC13 
{	
	static int ecount(String s) 
	{
		int ecount = 0;
		for (int i=0; i < s.length; i++)	
			if (s.charAt(i) == e)		
				ecount++;
		return ecount;
	}
}
