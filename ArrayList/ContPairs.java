class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int left = 0, right = nums.size() - 1;
        int c = 0;
        while (left < right) {
            int need = nums.get(left) + nums.get(right);
            if (need < target) {
                c += right - left;
                left++;
            } else {
                right--;
            }
        }
        return c;
    }
}
