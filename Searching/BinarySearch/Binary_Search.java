// BinarySearch
import java.util.Scanner;
public class BinarySearch
{
    public static int search(int[] num,int n,int tar)
    {
       int l=0,h=n-1;
       while(l<=h)
       {
            int mid=(l+h)/2;
            if(num[mid]==tar)
            {
                return mid;
            }
            else if(num[mid]>tar)
            {
                h=mid - 1;
            }
            else if(num[mid]<tar)
            {
                l=mid + 1;
            }
       }
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter elements into array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=sc.nextInt();
        int result=search(arr,n,target);
        if(result!=-1)
        System.out.println("the elementindex found at:"+result);
        else
        System.out.println("Element is not Found");
    }
}
