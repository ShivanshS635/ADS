package Jan20.maxSumSubarray;

public class maxSumSubarray {

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {1, -2, 3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums1));
        
        // Test case 2
        int[] nums2 = {-2, -3, -4, -1, -2};
        System.out.println(solution.maxSubArray(nums2));
        
        // Test case 3
        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println(solution.maxSubArray(nums3));
        
        // Test case 4
        int[] nums4 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums4));
    }
}
class Solution {
    public int maxSubArray(int[] nums){
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ;  i < nums.length ; i++){
        //     for(int j = i ; j < nums.length ; j++){
        //         int sum = 0;
        //         for(int k = i ; k <= j ; k++){
        //             sum += nums[k];
        //         }
        //         max = Math.max(max , sum);
        //     }
        // }
        // return max;

        //Kadane's algo

        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            maxi = Math.max(maxi , sum);
            if(sum < 0) sum = 0;
        }
        return maxi;
    }
}