//LinearSearch
import java.util.*;
// LinearSearch Function
public class LinearSearch{
    public static  int Search(int a[],int target)
    {
        for(int i=0;i<a.length;i++)
        {
             if(a[i]==target)
             {
                return i;
             }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target element:");
        int target=sc.nextInt();
        int result;
        result=Search(arr,target);
        if(result==-1)
        {
            System.out.println("Target number is not founde in array");
        }
        else
        {
            System.out.println("Target is found at index:"+result);
        }
    }
}
