import java.util.*;
class InterSorArr{
    public static void main(String[] args) {
        int[] A = {1,2,3,3,4,5};
        int[] B = {2,3,3,4,5,6};
        ArrayList<Integer> result=sortedArray(A,B);
        for(int n:result)
        {
            System.out.print(n+" ");
        }
    }
    public static ArrayList<Integer> sortedArray(int[] a,int[] b)
    {
        int n1=a.length,n2=b.length;
        int i=0,j=0;
        ArrayList<Integer> interArr=new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
            i++;
            else if(b[j]<a[i])
            j++;
            else
            { 
            interArr.add(a[i]);
            i++;
            j++;
            }
        }
        return interArr;
    }
}
