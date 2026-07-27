class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n=arr.length-1,sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int max=sum,l=0,r=k-1,c=0;
        double avg=sum/(double)k;
        if(avg>=threshold)
        c++;
        while(r<n)
        {
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            avg=sum/(double)k;
            if(avg>=threshold)
            {
                c++;
            }
        }
        return c;
    }
}
