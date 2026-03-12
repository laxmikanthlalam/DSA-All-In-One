import java.util.*;
class StrCntAtoB{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        if(s1.length()!=s2.length())
        {
            System.out.println("No");
            return;
        }
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            count++;
        }
        System.out.println("Yes"+" "+count);
    }
}
