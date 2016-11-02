public class Solution {
    public int thirdMax(int[] nums) {
        if(nums.length==0)return 0;
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second && nums[i]!=first){
                third=second;
                second=nums[i];
            }
            else if(nums[i]>third && nums[i]!=second && nums[i]!=first)third=nums[i];
            
        }
        
        return (third==Long.MIN_VALUE)?(int)first:(int)third;        
    }
}