class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        for(int i:nums)
        {
            arr[i]=true;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
             if(!arr[i])
             list.add(i);
        }
        return list;
    }
}
