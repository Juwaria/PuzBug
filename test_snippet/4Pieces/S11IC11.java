public class S11IC11 
{
	public static void FloydTriangle(int k) 
	{
		int n, num = 1, c, d;
		System.out.println("Floyd's triangle :-");

		for ( c = 1 ; c <= n ; c++ )
		{
			for ( d = 1 ; d <= c ; d++ )
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}
