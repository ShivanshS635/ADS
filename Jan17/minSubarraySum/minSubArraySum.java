package Jan17.minSubarraySum;

public class minSubArraySum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        System.out.println(solution.minSubArrayLen(target1, nums1));
        
        // Test case 2
        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        System.out.println(solution.minSubArrayLen(target2, nums2));
        
        // Test case 3
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target3 = 11;
        System.out.println(solution.minSubArrayLen(target3, nums3));
    }
}

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            while (currentSum >= target) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }
        
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
