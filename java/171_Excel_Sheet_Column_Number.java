public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for (char i : s.toCharArray()){
            result = result * 26 + i - 'A' + 1;
        }
        return result;
    }
}