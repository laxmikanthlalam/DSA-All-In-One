class Solution {
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack=new Stack<>();
        int n=temp.length;
        int res[]=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!stack.isEmpty() && temp[stack.peek()]<=temp[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                res[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        return res;
    }
}
