import java.util.*;
import java.lang.*;
import java.io.*;

class LayeredCake
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-- > 0)
		{
		    int n=in.nextInt();
		    int m=in.nextInt();
		    int a[]=new int[n];
		    int b[]=new int[m];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=in.nextInt();
		    }
		    for(int i=0;i<m;i++)
		    {
		        b[i]=in.nextInt();
		    }
		    int k=0;
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<m;j++)
		        {
		            if(a[i]>b[j])
		            k++;
		        }
		    }
		    System.out.println(k);
		}

	}
}
