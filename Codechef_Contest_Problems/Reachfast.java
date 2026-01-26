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
		while(t-- >0){
		    double a=sc.nextDouble();
		    double b=sc.nextDouble();
		    double x=sc.nextDouble();
		    //int sum=(Math.abs(b-a)/x);
		    System.out.println((int)Math.ceil(Math.abs(b-a)/x));
		}

	}
}
