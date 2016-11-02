public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carryin = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            if (i < 0) {
                int bBit = b.charAt(j) - '0';
                result.insert(0, bBit ^ carryin);
                carryin = bBit & carryin;
            } else if (j < 0) {
                int aBit = a.charAt(i) - '0';
                result.insert(0, aBit ^ carryin);
                carryin = aBit & carryin;
            } else {
                int aBit = a.charAt(i) - '0', bBit = b.charAt(j) - '0';
                int carryout = (aBit & bBit) | (aBit & carryin) | (bBit & carryin);
                result.insert(0, aBit ^ bBit ^ carryin);
                carryin = carryout;
            }
        }
        if (carryin == 1) result.insert(0, carryin);
        return result.toString();
    }
}