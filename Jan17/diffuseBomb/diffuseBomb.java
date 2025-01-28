package Jan17.diffuseBomb;

public class diffuseBomb {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] code1 = {5, 7, 1, 4};
        int k1 = 3;
        int[] result1 = solution.decrypt(code1, k1);
        System.out.print("Decrypted Code (Test 1): ");
        for (int num : result1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] code2 = {1, 2, 3, 4};
        int k2 = 0;
        int[] result2 = solution.decrypt(code2, k2);
        System.out.print("Decrypted Code (Test 2): ");
        for (int num : result2) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] code3 = {2, 4, 9, 3};
        int k3 = -2;
        int[] result3 = solution.decrypt(code3, k3);
        System.out.print("Decrypted Code (Test 3): ");
        for (int num : result3) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];
        if (k == 0) {
            return result;
        }
        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }
        return result;
    }
}
