package Feb11.TEST;
import java.util.*;
class Q1{
    public static int longestSubarraySumK(int arr[] , int k){
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int rem = 0;
        int len = 0;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            if(sum == k){
                len = Math.max(len, i+1);
            }
            rem = sum - k;
            if(map.containsKey(rem)){
                int newLen = i-map.get(rem);
                len = Math.max(len , newLen);
            }
            if(!map.containsKey(rem)){
                map.put(i, rem);
            }
        }
        return len;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int[] arr = new int [n];
        for(int i = 0 ; i<n ; i++){
            System.out.println("Enter the "+ i +" element : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();
        System.out.println(longestSubarraySumK(arr, k));
    }
}