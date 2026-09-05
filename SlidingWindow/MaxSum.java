import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		    Scanner sc=new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-- >0)
		    {
		        int n=sc.nextInt();
		        int k=sc.nextInt();
		        int a[]=new int[n];
		        int sum=0;
		        int x=n-k;
		        for(int i=0;i<n;i++)
		        {
		            a[i]=sc.nextInt();
		        }
		        for(int i=0;i<x;i++)
		        {
		            sum+=a[i];
		        }
		        int maxsum=sum;
		        for(int i=x;i<n;i++)
		        {
		            sum-=a[i-x];
		            sum+=a[i];
		            maxsum=Math.max(sum,maxsum);
		        }
		        System.out.println(maxsum);
		    }

	}
}
