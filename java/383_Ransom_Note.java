public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[26];
        for (char i : magazine.toCharArray()){
            hash[i-'a']++;
        }
        for (char i : ransomNote.toCharArray()){
            hash[i-'a']--;
            if (hash[i-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}