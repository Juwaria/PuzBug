public class TestS1IC1 
{
	public static void main(String[] avg) 
	{
		int[] nums = {4, 3,0 ,4};
		S1 s= new S1();
		int z[]=s.moveZeroes(nums);
		for(int i = 0; i < z.length; i++) { 
			System.out.println(z[i]);
		}
	}
}
