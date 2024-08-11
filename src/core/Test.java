package core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world");
		

	}
	
//	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//			Output: 6
	
	//-2,1,-3,
	
	public int sum(int[] nums) {
		
		int currentSum = nums[0];
		int globalSum = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			
			currentSum = max(nums[i], currentSum+nums[i]);
			globalSum = max(currentSum, globalSum);
			
		}
		
		
	}

}
