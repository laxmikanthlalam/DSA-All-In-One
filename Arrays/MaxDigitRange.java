class Solution {
    public int maxDigitRange(int[] nums) {
        int n=nums.length;
        int maxRange=0;
        for(int i=0;i<n;i++)
            {
                maxRange=Math.max(maxRange,getRange(nums[i]));
            }
        int s=0;
        for(int i=0;i<n;i++)
            {
                      if(getRange(nums[i])==maxRange)
                    s+=nums[i];
            }
        return s;
    }
    private int getRange(int n)
        {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        while(n>0)
            {
                int d=n%10;
                max=Math.max(max,d);
                min=Math.min(min,d);
                n=n/10;
            }
        return max-min;
        }
        
}
