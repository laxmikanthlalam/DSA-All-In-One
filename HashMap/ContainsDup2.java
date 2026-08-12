class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
        int s=0;
        if(!map.containsKey(nums[i]))
        {
            map.put(nums[i],i);
        }
        else
        {
        s=Math.abs(i-map.get(nums[i]));
        map.put(nums[i],i);
        if(s<=k)
        return true;
        }
       }
       return false;
    }
}
