public class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for(char i : s.toCharArray()){
            result ^= i;
        }
        for(char i : t.toCharArray()){
            result ^= i;
        }
        return result;
    }
}