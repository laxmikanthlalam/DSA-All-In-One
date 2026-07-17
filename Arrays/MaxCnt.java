class Solution {
    public int maximumCount(int[] nums) {
        int cp=0,cn=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]>0)
            cp++;
            else if(nums[i]<0)
            cn++;
        }
        if(cp>cn)
        return cp;
        else
        return cn;
    }
}
