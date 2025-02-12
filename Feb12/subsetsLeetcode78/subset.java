package Feb12.subsetsLeetcode78;

import java.util.ArrayList;
import java.util.List;

class subset{
    
    public static void gs(int[] nums , int in , List<Integer> curr , List<List<Integer>> res){
        res.add(new ArrayList<>(curr));
        for(int i = in ; i<nums.length ; i++){
            curr.add(nums[i]);
            gs(nums , i+1 , curr , res);
            curr.remove(curr.size()-1);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        gs(nums , 0 , new ArrayList<>() , res);
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> res = new ArrayList<>();
        res = subsets(nums);
        for(List<Integer> i : res){
            System.out.println(i);
        }
    }
}