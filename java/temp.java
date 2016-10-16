public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        int i = 0, sign = 1, result = 0, n = str.length();
        if ( i < n && str.charAt(i) == '-') {sign = -1; i++;}
        else if ( i < n && str.charAt(i) == '+') i++;
        while ( i < n && Character.isDigit( str.charAt(i) ) ){
            int num = Character.getNumericValue( str.charAt(i) );
            if ( result > Integer.MAX_VALUE / 10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            if (result == Integer.MAX_VALUE / 10 && sign == 1 && num >= Integer.MAX_VALUE % 10){
                return Integer.MAX_VALUE;
            }
            if (result == Integer.MAX_VALUE / 10 && sign == -1 && num >= Math.abs(Integer.MIN_VALUE) % 10){
                return Integer.MIN_VALUE;
            }
            result = result * 10 + num;
            i++;
        }
        return result * sign;
    }
}