class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+"))
            {
                int a=stack.pop();
                int sum=stack.pop()+a;
                stack.push(sum);
            }
            else if(s.equals("-"))
            {
                int a=stack.pop();
                int sum=stack.pop()-a;
                stack.push(sum);
            }
            else if(s.equals("/"))
            {
                int a=stack.pop();
                int sum=stack.pop()/a;
                stack.push(sum);
            }
            else if(s.equals("*"))
            {
                int a=stack.pop();
                int sum=stack.pop()*a;
                stack.push(sum);
            }
            else
            {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
