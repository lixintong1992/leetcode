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
String.format()

# Integer
Integer.toString(i)
Integer.parseInt(token)
Integer.bitCount(i)
Integer.toBinaryString(i)

# Arrays
int[] charMap = new int[256]; 
Arrays.fill(charMap, -1); 不能搞二维数组
Arrays.asList(num[i], num[lo], num[hi]);
System.arraycopy(buffer /* src */, 0 /* srcPos */, buf /* dest */, readBytes /* destPos */, bytes /* length */); 
Arrays.sort(num);

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
map.remove(nums[i]);

# List
res.add(i);
res.add(index, element);
boolean remove(int index);
set(int index, E element);
get(int index)   返回列表中指定位置的元素
subList(int fromIndex, int toIndex)    返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分元素。
list.size() <= 0;
Iterator it = al.iterator();
    while (it.hasNext()){
        Object obj = it.next();

# Queue
Queue<TreeNode> q = new LinkedList<>(); 
q.add(root);
TreeNode node = q.poll();

# HashSet
HashSet hashSet = new HashSet();
hashSet.add("a");
Iterator it = hashSet.iterator();
  while(it.hasNext()){
   Object obj = it.next();
hashSet.remove(Object);
hashSet.contains(new String("a")))