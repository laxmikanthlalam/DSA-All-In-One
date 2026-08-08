class Solution {
    public boolean isValid(String s) {
       Stack<Character> stack=new Stack<>();
       int n=s.length();
       for(int i=0;i<n;i++)
       {
        char ch=s.charAt(i);
        if(ch=='(' || ch=='[' || ch=='{')
        stack.push(ch);
        else
        {
            if(stack.isEmpty())
            return false;
            char a=stack.peek();
            if(ch==')' && a=='(')
            stack.pop();
            else if(ch=='}' && a=='{')
            stack.pop();
            else if(ch==']' && a=='[')
            stack.pop();
            else
            return false;
        }
       }
       if(stack.isEmpty())
       return true;
       return false;
    }
}
