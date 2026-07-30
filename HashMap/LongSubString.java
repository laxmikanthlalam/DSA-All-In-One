class Solution {
    public int lengthOfLongestSubstring(String s) {
      HashMap<Character,Integer> map=new HashMap<>();
      int l=0,n=s.length();
      int max_sum=0;
      for(int r=0;r<n;r++)
      {
        char ch=s.charAt(r);
        if(map.containsKey(ch) )
        {
            if(map.get(ch)>=l)
            {
                l=map.get(ch)+1;
            }
        }
        map.put(ch,r);
        max_sum=Math.max(max_sum,r-l+1);
      }
      return max_sum; 
    }
}
