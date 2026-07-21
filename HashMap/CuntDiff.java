class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int c=0;
        for(int i:nums)
        {
            c+=map.getOrDefault(i-k,0);// a-b=k , b=a-k
            c+=map.getOrDefault(i+k,0);//b-a=k , b=a+k
            
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return c;
    }
}
