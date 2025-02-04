package Feb04.shortestSubstringLPS;

public class lps {
    public static void main(String[] args) {
        String s = "aacecaaa";
        System.out.println(shortestPalindrome(s));
    }

    public static String shortestPalindrome(String s){
        if(s == null || s.length() == 0){
            return "";
        }

        String t = s + "#" + new StringBuilder(s).reverse().toString();
        int lps[] = cLps(t);

        int palLen = lps[lps.length-1];
        String rem = s.substring(palLen);
        return new StringBuilder(rem).reverse().toString() + s;
    }

    private static int[] cLps(String s){
        int n = s.length();
        int lps[] = new int[n];
        int j = 0;
        for(int i = 1 ; i < n ; i++){
            while(j > 0 && s.charAt(i) != s.charAt(j)){
                j = lps[j-1];
            }
            if(s.charAt(i) == s.charAt(j)){
                lps[i] = ++j;
            }
        }
        return lps;
    }
}
