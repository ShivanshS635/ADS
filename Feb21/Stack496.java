package Feb21;

import java.util.*;

public class Stack496 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        int [] res = s.nextGreaterElement(nums1, nums2);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.getOrDefault(nums1[i], -1);
        }
        
        return res;
    }
}