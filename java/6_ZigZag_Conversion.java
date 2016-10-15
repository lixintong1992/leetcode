public class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] result = new StringBuilder[numRows];
        for (int j = 0; j < numRows; j++)
            result[j] = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++) {
                result[j].append(s.charAt(i++));
            }
            for (int j = numRows - 2; j > 0 && i < s.length(); j--) {
                result[j].append(s.charAt(i++));
            }
        }
        for (int j = 1; j < numRows; j++) {
            result[0].append(result[j]);
        }
        return result[0].toString();
    }
}
