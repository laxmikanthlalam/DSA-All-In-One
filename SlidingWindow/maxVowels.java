class Solution {
    public int maxVowels(String s, int k) {
        s=s.toLowerCase();
        int sum=0;
        int max=0;
        for(int i=0;i<k;i++)
            {
                char ch=s.charAt(i);
                sum=sum+Vol(ch);
            }
        max=sum;
        int l=0,n=s.length();
        for(int r=k;r<n;r++)
            {
                sum=sum-Vol(s.charAt(l))+Vol(s.charAt(r));
                max=Math.max(max,sum);
                l++;
            }
        return max;
        
    }
    public static int Vol(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                    return 1;
        return 0;
    }
}
