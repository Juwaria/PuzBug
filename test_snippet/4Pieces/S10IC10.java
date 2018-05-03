
public class S10IC10 
{
	public static void multiplicationTable(int n) 
	{		
		int i = 0;
		System.out.println("The Multiplication table of " n);	
		while(i < 10) 
		{
			System.out.println(++i +" * " + n + " = " + i*n);	
			i++;
		}
	}
}
