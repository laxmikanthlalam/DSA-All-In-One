import java.io.*;
import java.util.*;

public class Rectangle {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    for(int i=1;i<=n;i++)
    {
        for(int j=n;j>0;j--)
        {
            if(j==i)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(j);
            }
        }
        System.out.println();
    }
    }
}
