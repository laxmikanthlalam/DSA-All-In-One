class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0,rsum=0,maxsum=0;
        for(int i=0;i<k;i++)
        {
            lsum+=arr[i];
        }
        maxsum=lsum;
        rsum=lsum;
        int r=arr.length-1;
        for(int i=k-1;i>=0;i--)
        {
            rsum=rsum-arr[i]+arr[r];
            maxsum=Math.max(maxsum,rsum);
            r--;
        }
        return maxsum;
    }
}
