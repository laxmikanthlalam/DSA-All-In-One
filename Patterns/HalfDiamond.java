import java.io.*;
import java.util.*;

public class HalfDiamond {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=n-1;i>0;i--)
    {
       for(int j=1;j<=i;j++)
       {
        System.out.print("*");
       }
       System.out.println();
    }
    }
}
