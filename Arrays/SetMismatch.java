class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        boolean[] arr=new boolean[n+1];
        int[] a=new int[2];
        for(int i : nums)
            {
                if(arr[i]==true)
                {
                    a[0]=i;
                }
                else
                {
                    arr[i]=true;
                }
            }
        
        for(int i=1;i<=n;i++)
            {
                if(!arr[i])
                    a[1]=i;
            }
        return a;
    }
}
