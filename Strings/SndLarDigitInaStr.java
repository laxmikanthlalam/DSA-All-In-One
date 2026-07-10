class Solution {
    public int secondHighest(String s) {

        int max = -1;
        int smax = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int d = ch - '0';

                if (d > max) {
                    smax = max;
                    max = d;
                } else if (d != max && d > smax) {
                    smax = d;
                }
            }
        }

        return smax;
    }
}
