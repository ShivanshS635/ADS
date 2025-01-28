package Jan14.runningSum;

public class runningSum {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {1, 2, 3, 4};

        int[] result = solution.runningSum(nums);

        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i = 1 ; i < nums.length ; i++){
            nums[i] += nums[i-1]; 
        }
        return nums;
    }
}