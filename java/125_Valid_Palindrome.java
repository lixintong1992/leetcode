public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) { // Move 2 pointers from each end until they collide
        while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) i++; // Increment left pointer if not alphanumeric
        while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) j--; // Decrement right pointer if no alphanumeric
        if (s.charAt(i) != s.charAt(j)) return false; // Exit and return error if not match
        }
    return true;
    }
}