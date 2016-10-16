public class Solution {
    public int reverse(int x) {
        int sign = 1, result = 0;
        if (x < 0){
            sign = -1;
        }
        x = Math.abs(x);
        if (x < 0){
            return 0;
        }
        while (x != 0){
            int tail = x % 10;
            if ( result > Integer.MAX_VALUE / 10){
                return 0;
            }
            if (result == Integer.MAX_VALUE / 10 && sign == 1 && tail > Integer.MAX_VALUE % 10){
                return 0;
            }
            if (result == Integer.MAX_VALUE / 10 && sign == -1 && tail > Math.abs(Integer.MIN_VALUE + 10 ) % 10){
                return 0;
            }
            result = result * 10 + tail;
            x = x / 10;
        }
        return result * sign;
    }
}