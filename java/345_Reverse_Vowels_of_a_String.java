public class Solution {
    public String reverseVowels(String s) {
        char[] list=s.toCharArray();
        String set = "aeiouAEIOU";
        for(int i=0,j=list.length-1;i<j;){
            if(!set.contains(list[i] + "")){
                i++;
                continue;
            }
            if(!set.contains(list[j] + "")){
                j--;
                continue;
            }
            char temp=list[i];
            list[i]=list[j];
            list[j]=temp;
            i++;
            j--;
        }
        return String.valueOf(list);
    }
}