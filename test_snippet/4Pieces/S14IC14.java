
public class S14IC14 
{
	static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	static boolean validmonth(int mth, int day) 
	{
		return (mth >= 1) && (mth <= 12) && (day >= 1) && (day <= days[mth]);	
	}
	static boolean leapyear(int y) 
	{
		return y % 4 = 0 && y % 100 != 0 || y % 400 = 0;
	}
}
