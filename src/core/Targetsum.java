package core;

public class Targetsum
{
public static void main(String[] args)
{
Targetsum t = new Targetsum();
int[] nums= {1,2,3,7};
System.out.println(t.numbers(nums));
}


public int[] numbers(int[] nums){

int[] result= new int[2];
int target = 9;

for(int i=0;i<nums.length;i++)
{
for(int j=i+1;j<nums.length;j++)
{
if(nums[i]+nums[j] == target)
{
 result[0]=nums[i];
 result[1]=nums[j];
}
}
}
return result;
}
}

