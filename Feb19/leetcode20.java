public class leetcode20 {
    
}

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()) return false;
                char ch2 = st.pop();
                if(( ch == ')' && ch2 != '(') || 
                ( ch == ']' && ch2 != '[') || 
                ( ch == '}' && ch2 != '{')){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}