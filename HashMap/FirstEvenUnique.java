class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0 && map.get(nums[i])==1)
            return nums[i];
        }
        return -1;
    }
}
