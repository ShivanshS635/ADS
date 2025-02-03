public class stringCopression {
    public static void main(String[] args) {
        System.out.println(stringCompress("aaabbccaaaabd"));
    }

    public static String stringCompress(String s1){
        if(s1 == null || s1.length() == 0) return "";
        StringBuilder ans = new StringBuilder();
        int count = 1;

        for(int i = 1 ; i < s1.length() ; i++){
            if(s1.charAt(i) == s1.charAt(i-1)){
                count++;
            }
            else{
                ans.append(s1.charAt(i-1)).append(count);
                count = 1;
            }
        }
        ans.append(s1.charAt(s1.length()-1)).append(count);
        return ans.toString();
    }
}