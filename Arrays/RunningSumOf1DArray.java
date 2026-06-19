import java.util.*;

public class Main {

    public static int[] runningSum(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.println(Arrays.toString(result));
    }
}
