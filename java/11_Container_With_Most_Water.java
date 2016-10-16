public class Solution {
    public int maxArea(int[] height) {
        int result = 0;
        int i = 0, j = height.length - 1;
        while(i < j){
            int h = Math.min(height[i], height[j]);
            result = Math.max( result, (j - i) * h );
            while(height[i] <= h && i < j) i++;
            while(height[j] <= h && i < j) j--;
        }
        return result;
    }
}