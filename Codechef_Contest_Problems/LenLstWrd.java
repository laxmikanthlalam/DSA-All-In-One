import java.util.*;
class LenLstWrd{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        StringTokenizer s1=new StringTokenizer(s);
        String x="";
        while(s1.hasMoreTokens()){
          x=s1.nextToken();
        }
        System.out.println(x.length());
        //2nd approach
        String s2[]=s.split(" ");
        String s3=s2[s2.length-1];
        System.out.println(s3.length());
    }
}
