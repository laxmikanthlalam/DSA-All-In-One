class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        int c=0;
        int j=0;
        while(j<n)
        {
        c=0;
        for(int i=0;i<n;i++)
        {
         if(nums[j]>nums[i])
         {
            c++;
         }
         arr[j]=c;
        }
        j++;
        }
        return arr;


    }
}
