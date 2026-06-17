class Solution {
    public int majorityElement(int[] nums) {

        // Variable to store the current majority candidate
        int candidate = 0;

        // Counter for the candidate
        int count = 0;

        // Traverse the array
        for (int num : nums) {

            // If count becomes 0, choose a new candidate
            if (count == 0) {
                candidate = num;
            }

            // If current element matches candidate, increase count
            if (num == candidate) {
                count++;
            }
            // Otherwise decrease count
            else {
                count--;
            }
        }

        // The remaining candidate is the majority element
        return candidate;
    }
}
