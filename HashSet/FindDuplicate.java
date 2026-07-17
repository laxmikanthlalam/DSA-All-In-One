class Solution {
    public int findDuplicate(int[] nums) {
       int n=nums.length;
       HashSet<Integer> set=new HashSet<>();
       int p=0;
       for(int i=0;i<n;i++)
       {
        if(!set.contains(nums[i]))
        set.add(nums[i]);
        else
        {
         p=nums[i];
        }
       }
       return p;
    }
}
