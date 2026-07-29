// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        String s="loonbalxballpoon";
        int n=s.length();
        int cb=0,ca=0,cl=0,co=0,cn=0;
        for(int i=0;i<n;i++)
        {
          char ch=s.charAt(i);
          if(ch=='b')
          cb++;
          else if(ch=='a')
          ca++;
          else if(ch=='l')
          cl++;
          else if(ch=='o')
          co++;
          else if(ch=='n')
          cn++;
        }
        int min=Math.min(Math.min(cb,ca),Math.min((cl/2),Math.min((co/2),cn)));
        System.out.println(min);
    }
}
