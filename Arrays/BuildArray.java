import java.util.Arrays;

public class Main {

    static class Solution {
        public int[] buildArray(int[] nums) {
            int[] arr = new int[nums.length];

            for (int i = 0; i < nums.length; i++) {
                arr[i] = nums[nums[i]];
            }

            return arr;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};

        Solution sol = new Solution();
        int[] result = sol.buildArray(nums);

        System.out.println(Arrays.toString(result));
    }
}
