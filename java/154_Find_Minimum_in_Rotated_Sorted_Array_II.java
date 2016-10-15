public class Solution {
    public int findMin(int[] nums) { 
       int L = 0, R = nums.length - 1; 
       while (L < R && nums[L] >= nums[R]) { 
          int M = (L + R) / 2; 
          if (nums[M] > nums[R]) { 
             L = M + 1; 
          } else if (nums[M] < nums[L]) { 
             R = M; 
          } else {   // nums[L] == nums[M] == nums[R] 
             L = L + 1; 
          } 
       } 
       return nums[L]; 
    } 
}