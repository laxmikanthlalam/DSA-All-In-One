class Solution {
    public int maxSum(int[] nums) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i:nums)
        {
            int d=Largest(i);
            if(map.containsKey(d))
            {
                map.get(d).add(i);
            }
            else
            {
                map.put(d,new ArrayList<>());
                map.get(d).add(i);
            }
        }
        int mx=0;
        for(List<Integer> list:map.values())
        {
            Collections.sort(list);
            int ln=list.size();
            if(ln<=1) continue;
            int sum=list.get(ln-1)+list.get(ln-2);
            mx=Math.max(mx,sum);
        }
        return mx==0?-1:mx;
        
    }
    public int Largest(int n)
    {
        int mx=0;
        while(n>0)
        {
            int d=n%10;
            if(d>mx)
            {
                mx=d;
            }
            n/=10;
        }
        return mx;
    }
}
