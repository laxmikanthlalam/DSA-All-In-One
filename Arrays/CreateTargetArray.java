class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int arr[]=new int[n];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<n;i++)
        {
           arr[i]=list.get(i);
        }
        return arr;
    }
}
