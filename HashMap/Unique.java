import java.io.*;
import java.util.*;

public class Unique {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
        if(map.containsKey(arr[i]))
        {
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
    }
    for(int i=0;i<n;i++)
    {
        if(map.get(arr[i])==1)
        System.out.print(arr[i]+" ");
    }
    }
}
