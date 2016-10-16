# Character
Character.isLetterOrDigit(str.charAt(i));
Character.isWhitespace(str.charAt(i));
Character.isDigit(str.charAt(i));
Character.getNumericValue(str.charAt(i));

# String
s.charAt(i);
s.length();
s = s.substring(0, s.length() - 1);
String str=s.trim();
int i = 0;
String.valueOf(i)
for (char c : s.toCharArray())
strs[i].indexOf(pre) 
int indexOf(String str) ：返回第一次出现的指定子字符串在此字符串中的索引。 

# Integer
Integer.toString(i)

# Arrays
import java.util.Arrays;
int[] charMap = new int[256]; 
Arrays.fill(charMap, -1);
System.arraycopy(buffer /* src */, 0 /* srcPos */, buf /* dest */, readBytes /* destPos */, bytes /* length */); 

# Math
Math.abs(Integer.MIN_VALUE) == Integer.MIN_VALUE;
Math.max(1,4);
Math.min(1,4);

# StringBuilder
StringBuilder reversed = new StringBuilder(); 
reversed.length();
reversed.append(' ');
reversed = reversed.reverse();
reversed.toString();

# HashMap
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
map.containsKey(target - nums[i]);
map.get(target - nums[i]);
map.put(nums[i], i);