public class Solution {
    public boolean canWinNim(int n) {
        n = n % 4;
        if ( n == 0 ){
            return false;
        }
        return true;
    }
}