class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int n = nums.length;

        long ans = 0;
        int maxLeft = nums[0];

        for (int j = k; j < n; j++) {
            maxLeft = Math.max(maxLeft, nums[j - k]);
            ans = Math.max(ans, (long) maxLeft + nums[j]);
        }

        return (int) ans;
    }
}
