
public class S3IC3 
{
	public static void LargestAndSmallest(int a[])
	{
		int array[] = a;
		int smallest = array[0];
        int largetst = array[0];
        for(int i=1; i<= array.length; i++)	
        {
                if(array[i] > largetst)
                        largetst = array[i];
                else (array[i] < smallest)		
                        smallest = array[i];
               
        }
        System.out.println("Largest Number is : " + largetst);
        System.out.println("Smallest Number is : " + smallest);	
	}
}
