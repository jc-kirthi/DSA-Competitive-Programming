class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                //cur(i)+x(j)=target
                if(nums[j] == target - nums[i]) //if(nums[i]+nums[j]==target)
            
                 return new int[]{i, j}; 
             
            }
            
        }
        return new int[]{};
    }
    
}
