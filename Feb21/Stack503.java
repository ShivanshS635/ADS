package Feb21;

import java.util.*;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(res , -1);
        for(int i = 0 ; i < 2*n ; i++){
            int num = nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()] < num){
                res[stack.pop()] = num;
            }
            if(i < n) stack.push(i);
        }
        return res;
    }
}

public class Stack503 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,2,1};
        int [] res = s.nextGreaterElements(nums);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
}