
public class S4IC4 
{
	public static int ReverseNumber(int num) 
	{
		 int reversedNumber;	
         int temp = 0;
         while(num > 0)
         {    
                 temp = num%10;
                 reversedNumber = reversedNumber * 10 + temp;
                 num = num/10;    
         }
		return temp;
	}
}
