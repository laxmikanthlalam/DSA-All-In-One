class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0,n=nums.length-1;
       for(int i=0;i<k;i++)
       {
         sum+=nums[i];
       }
       int max=sum;
       int l=0,r=k-1;
       while(r<n)
       {
        sum=sum-nums[l];
        l++;
        r++;
        sum=sum+nums[r];
        max=Math.max(max,sum);
       }
       return (max/(double)k);
    }
}
