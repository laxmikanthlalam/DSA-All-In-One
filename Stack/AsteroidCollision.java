class Solution {
    public int[] asteroidCollision(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                stack.push(arr[i]);
            } 
            else {

                boolean destroyed = false;

                while (!stack.isEmpty() && stack.peek() > 0) {

                    if (Math.abs(arr[i]) > stack.peek()) {
                        // Top asteroid is destroyed
                        stack.pop();
                    }
                    else if (Math.abs(arr[i]) == stack.peek()) {
                        // Both are destroyed
                        stack.pop();
                        destroyed = true;
                        break;
                    }
                    else {
                        // Current asteroid is destroyed
                        destroyed = true;
                        break;
                    }
                }

                if (!destroyed) {
                    stack.push(arr[i]);
                }
            }
        }

        int m = stack.size();
        int[] result = new int[m];

        for (int i = m - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
