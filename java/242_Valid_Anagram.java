public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char i : s.toCharArray()){
            if (map.containsKey(i)) map.put(i, map.get(i)+1);
            else map.put(i, 1);
        }
        for (char i : t.toCharArray()){
            if (map.containsKey(i)) {
                if (map.get(i) == 0)return false;
                else map.put(i, map.get(i)-1);
            }
            else return false;
        }
        return true;
    }
}