class Solution {
    public boolean isMatch(String s, String p) {
        return RegExp(0,0,s,p);
    }
    static boolean RegExp(int i,int j,String s,String p)
    {
        if(i==s.length() && j==p.length())
        {
            return true;
        }
        if(j==p.length())
        {
            return false;
        }
        boolean match=false;
        if(i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'))
        {
            match=true;
        }
        if(j+1<p.length() && p.charAt(j+1)=='*')
        {
            boolean skip=RegExp(i,j+2,s,p);
            boolean takes=false;
            if(match)
            {
                takes=RegExp(i+1,j,s,p);
            }
            return skip||takes;
        }
        else
        {
            if(!match)
            {
                return false;
            }
        }
        return RegExp(i+1,j+1,s,p);
    }
}
