package Jan18.containsDups;
import java.util.HashSet;
public class containsDups {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums1));
        
        // Test case 2
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(solution.containsDuplicate(nums2));
        
        // Test case 3
        int[] nums3 = {1, 1, 1, 1};
        System.out.println(solution.containsDuplicate(nums3));
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}