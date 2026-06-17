import java.util.Arrays;

class Solution {

    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sol.sortedSquares(nums);

        System.out.println(Arrays.toString(result));
    }
}
