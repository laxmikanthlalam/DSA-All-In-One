class Solution {
    public long sumAndMultiply(int n) {
        long s = 0;
        long s2 = 0;

        while (n > 0) {
            int d = n % 10;

            if (d != 0) {
                s += d;
                s2 = s2 * 10 + d;
            }

            n /= 10;
        }

        long r = 0;

        while (s2 > 0) {
            long d = s2 % 10;
            r = r * 10 + d;
            s2 /= 10;
        }

        return r * s;
    }
}
