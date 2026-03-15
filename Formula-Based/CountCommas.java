import java.util.*;
class CountCommas {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int result=countCommas(n);
        System.out.println(result);
    }
    public static  int countCommas(int n) {
        int c=0;
        int m=n;
        while(n>0)
            {
                int d=n%10;
                c++;
                n=n/10;
            }
        if(c<4)
        {
            return 0;
        }
        else
        {
            return (m-1000)+1;
        }
    }
}
