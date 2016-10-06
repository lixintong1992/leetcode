public class Solution {
    public boolean isNumber(String s) {
        s = s.trim();
        int i = 0, n = s.length(); 
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++; 
        boolean isNumeric = false; 
        while (i < n && Character.isDigit(s.charAt(i))) { 
           i++; 
           isNumeric = true; 
        }    
        if (i < n && s.charAt(i) == '.') { 
           i++; 
           while (i < n && Character.isDigit(s.charAt(i))) { 
              i++; 
              isNumeric = true; 
           }    
        }
        if (isNumeric && i < n && s.charAt(i) == 'e') { 
           i++; 
           isNumeric = false; 
           if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++; 
           while (i < n && Character.isDigit(s.charAt(i))) { 
              i++; 
              isNumeric = true; 
           } 
        } 
        return isNumeric && i == n;     
    }
}
