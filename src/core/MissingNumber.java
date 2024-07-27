package core;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		MissingNumber mn = new MissingNumber();
		int[] nums = {1,3,4,5,6};
		int answer=mn.missingNumber(nums);
		System.out.println(answer);
	}

	public int missingNumber(int[] nums) {
		int n = nums.length+1;

		int sum =0;

		for(int i=0;i<nums.length;i++){

		sum = sum+nums[i];
		}
		int totalsum = n*(n+1)/2;

		int result = totalsum - sum;

		return result;
	}
}
