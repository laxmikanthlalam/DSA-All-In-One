import java.io.*;
import java.util.*;

public class Floydp2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
        int num=i;
        int jump=n-1;
        for(int j=1;j<=i;j++)
        {
           System.out.print(num+" ");
           num=num+jump;
           jump--;
        }
        System.out.println();
    }
    }
}
