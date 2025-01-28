package Jan15.highestAltitude;
public class highestAltitude {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] gain1 = {-5, 1, 5, 0, -7};
        int result1 = solution.largestAltitude(gain1);
        System.out.println("Highest Altitude (Test 1): " + result1);
    }
}

class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int highestAltitude = 0;
        for (int g : gain) {
            currentAltitude += g;
            highestAltitude = Math.max(highestAltitude, currentAltitude);
        }
        return highestAltitude;
    }
}
