package core;

public class Targetsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums = {1,2,3,8};
		
		Targetsum.targetSum(new int[]{1,2,3,8});
	}
	
	public static void targetSum(int[] nums){

		
		int target =9;                                                               
		for(int i=0;i<nums.length;i++)
		{
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[i]+nums[j]==target)
				{
					System.out.println(nums[i] + " "+ nums[j]+ " ");
					
				}
			}
		}
		

}
}
