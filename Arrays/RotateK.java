// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class RotateK {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int k=in.nextInt();
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        rotate(a,k);
    }
    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);  
        reverse(nums, 0, k - 1);   
        reverse(nums, k, n - 1);
    }
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }

}
