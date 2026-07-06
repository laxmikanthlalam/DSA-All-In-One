class Solution {
    public int[] selectionSort(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the minimum
            int min = i;

            // Find the index of the smallest element
            for (int j = i + 1; j < n; j++) {
                if (nums[min] > nums[j]) {
                    min = j;
                }
            }

            // Swap the smallest element with the current element
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

        return nums;
    }
}
