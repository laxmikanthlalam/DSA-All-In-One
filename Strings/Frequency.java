import java.util.*;
class Frequency{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        int c=0;
        char ch=in.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==ch)
            c++;
        }
        System.out.println(c);
    }
}
