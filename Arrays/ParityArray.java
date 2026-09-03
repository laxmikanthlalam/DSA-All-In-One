class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE,n=nums1.length;
        boolean flag=true;
        for(int i=0;i<n;i++)
            {
                if(nums1[i]%2!=0)
                {
                    flag=false;
                }
                if(nums1[i]<min)
                {
                    min=nums1[i];
                }
            }
            if(flag)
            {
                return true;
            }
            if(min%2!=0)
            {
                return true;
            }
            return false;
    }
}
