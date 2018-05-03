public class S1 
{
	public static int[] moveZeroes(int[] nums) 
	{
		if(nums.length <= 0) 
		{
		return nums;
		}
		int count = 0;
		for(int i = 0; i < nums.length; i++) 
		{ 
			if (nums[i] != 0) 
			{
				int temp = nums[count];
				nums[++count] = nums[i]; 
				nums[i] = temp;
			}
		}
		return nums;
	}	
}


	
