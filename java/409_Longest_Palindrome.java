public class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 0) return 0;
        HashSet<Character> set = new HashSet<>();
        int result = 0;
        for (char i: s.toCharArray()){
            if (set.contains(i)){
                set.remove(i);
                result += 2;
            }
            else set.add(i);
        }
        if (result < s.length()) result ++;
        return result;
    }
}