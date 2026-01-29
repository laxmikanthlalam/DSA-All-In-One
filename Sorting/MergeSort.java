import java.io.*;
import java.util.*;

public class MergeSort {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    mergesort(arr,0,n-1);
    }
    static void mergesort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
            for(int x:arr)
        {
            System.out.print(x+" ");
        }
        System.out.println();
        }
    }
    static void merge(int[] arr,int l,int m,int r)
    {
        int n1=m-l+1;
        int n2=r-m;
        int[] L=new int[n1];
        int[] R=new int[n2];

        for(int i=0;i<n1;i++)
        L[i]=arr[l+i];
        for(int j=0;j<n2;j++)
        R[j]=arr[m+1+j];
        int i=0,j=0,k=l;
        while(i<n1 && j<n2)
        {
            if(L[i]<=R[j])
            arr[k++]=L[i++];
            else
            arr[k++]=R[j++];
        }
        while(i<n1)
        arr[k++]=L[i++];
        while(j<n2)
        arr[k++]=R[j++];
    }
    }
