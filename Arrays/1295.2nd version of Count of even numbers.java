class EvenNumbers {
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int ans = findNumbers(nums);
        System.out.println("Number of elements that have even number of digits: " + ans);
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = (int) Math.log10(nums[i]) + 1;

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
