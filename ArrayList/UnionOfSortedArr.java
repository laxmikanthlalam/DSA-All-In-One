import java.util.*;
class UnionOfSortedArr{
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,6};
        int[] b={2,3,5};
        ArrayList<Integer> result=sortedArray(a,b);
        for(int n:result)
        {
            System.out.print(n+" ");
        }
    }
    public static ArrayList<Integer> sortedArray(int[] a,int[] b)
    {
        int n1=a.length;
        int n2=b.length;
        int i=0,j=0;
        ArrayList<Integer> unionArr=new ArrayList<>();
        while(i<n1 && j<n2)
        {
            if(a[i]<=b[j])
            {
                if(unionArr.isEmpty()|| unionArr.get(unionArr.size()-1)!=a[i])
                {
                    unionArr.add(a[i]);
                }
                i++;
            }
            else{
                if(unionArr.isEmpty()|| unionArr.get(unionArr.size()-1)!=b[j])
                {
                    unionArr.add(b[j]);
                }
                j++;
            }
        }
        while(i<n1)
        {
            if(unionArr.isEmpty()|| unionArr.get(unionArr.size()-1)!=a[i])
                {
                    unionArr.add(a[i]);
                }
                i++;
        }
        while(j<n2)
        {
            if(unionArr.isEmpty()|| unionArr.get(unionArr.size()-1)!=b[j])
                {
                    unionArr.add(b[j]);
                }
                j++;
            }
        return unionArr;
    }
}
