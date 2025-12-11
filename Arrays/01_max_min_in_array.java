// Problem 01: Find Minimum and Maximum in an Array
// Topic: Arrays
// Difficulty: Easy
// Language: Java
// Time Complexity: O(n)
// Space Complexity: O(1)
import java.util.*;
public class Array{
    public static void main(String[] args){
        System.out.println("Enter value of n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements into the array:");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.printf("Minimum value is: %d\n",min);
        System.out.printf("Maximum value is: %d",max);
    }
}
