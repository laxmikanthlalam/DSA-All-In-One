class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums)
        {
            if(map.get(i)>(n/3) && !list.contains(i))
            list.add(i);
        }
        return list;
    }
}
