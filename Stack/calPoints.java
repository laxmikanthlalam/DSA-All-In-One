class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
         Stack<Integer> stack=new Stack<>();
     for(String s:operations)
     {
        if(s.equals("+"))
        {
            int a=stack.pop();
            int b=a+stack.peek();
            stack.push(a);
            stack.push(b);
            sum+=b;
        }
        else if(s.equals("D"))
        {
            int b=2*(stack.peek());
            stack.push(b);
            sum+=b;
        }
        else if(s.equals("C"))
        {
            sum-=stack.pop();
        }
        else
        {
            stack.push(Integer.parseInt(s));
            sum+=Integer.parseInt(s);
        }
     }
     return sum;
       
    }
}
