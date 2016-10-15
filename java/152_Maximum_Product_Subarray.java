public class Solution {
    public int maxProduct(int[] nums) { 
       assert nums.length > 0; 
       int max = nums[0], min = nums[0], maxAns = nums[0]; 
       for (int i = 1; i < A.length; i++) { 
          int mx = max, mn = min; 
          max = Math.max(Math.max(nums[i], mx * nums[i]), mn * nums[i]); 
          min = Math.min(Math.min(nums[i], mx * nums[i]), mn * nums[i]); 
          maxAns = Math.max(max, maxAns); 
       } 
       return maxAns; 
    } 
}