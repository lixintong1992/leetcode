public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        String temp = "";
        for (int i = 1; i <= n; i++){
            temp = "";
            if (i % 3 == 0){
                temp += "Fizz";
            }
            if (i % 5 == 0){
                temp += "Buzz";
            }
            if (temp.length() == 0){
                temp = String.valueOf(i);
            }
            result.add(temp);
        }
        return result;
    }
}