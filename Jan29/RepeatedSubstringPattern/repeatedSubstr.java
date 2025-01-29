package Jan29.RepeatedSubstringPattern;

public class repeatedSubstr {
    public static void main(String[] args) {
        Solution sn = new Solution();
        System.out.println(sn.repeatedSubstringPattern("abab"));
        System.out.println(sn.repeatedSubstringPattern("aba"));
    }
}
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doub = s+s;
        return doub.substring(1 , doub.length()-1).contains(s);
    }
}