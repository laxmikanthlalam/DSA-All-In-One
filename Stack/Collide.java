// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Stack<Character> stack=new Stack<>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char ch=s.charAt(i);
        if(!stack.isEmpty())
        {
            if(stack.peek()==ch)
            {
                stack.pop();
            }
            else
            stack.push(ch);
        }
        else
        stack.push(ch);
    }
    StringBuilder sb=new StringBuilder();
    if(stack.isEmpty())
    {
        System.out.print("No Bombs Left!");
    }
    else
    {

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }
        sb.reverse();
        System.out.print(sb);
    }
    }
}
