public class Solution {
    public int firstUniqChar(String s) {
        int[] map = new int[256];
        int result = -1;
        HashSet set = new HashSet();
        for (int i = 0; i < s.length(); i++){
            map[s.charAt(i)]++;
        }
        for (int i = s.length() - 1; i >= 0; i--){
            if (map[s.charAt(i)] == 1)result = i;
        }
        return result;
    } 
          
}