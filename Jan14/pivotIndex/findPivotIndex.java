package Jan14.pivotIndex;

public class findPivotIndex {
   public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        System.out.println("Pivot Index: " + solution.pivotIndex(nums1));
    }
}

class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int tot =0 ;
        for(int i=0 ; i<n ; i++){
            tot += nums[i];
        }
        int leftsum = 0;
        for(int i=0 ; i<n ; i++){
            if(leftsum == (tot-leftsum-nums[i])){
                return i;
            }
            leftsum += nums[i];
        }
        return -1;
    }
}