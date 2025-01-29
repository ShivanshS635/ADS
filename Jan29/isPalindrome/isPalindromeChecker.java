package Jan29.isPalindrome;

public class isPalindromeChecker {
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("Race a car"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome("2malayalam2"));
    }
}
