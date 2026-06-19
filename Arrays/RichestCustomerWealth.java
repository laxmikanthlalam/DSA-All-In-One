import java.util.*;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int[] customer : accounts) {
            int wealth = 0;

            for (int money : customer) {
                wealth += money;
            }

            maxWealth = Math.max(maxWealth, wealth);
        }

        return maxWealth;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1}
        };

        System.out.println(sol.maximumWealth(accounts));
    }
}
