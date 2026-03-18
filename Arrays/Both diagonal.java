class Solution {
    public int diagonalSum(int[][] mat) {
        int s1=0,s2=0;
        int n=mat.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    s1+=mat[i][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n/2;j++)
            {
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    s2+=mat[i][j];
                }
            }
        }        
        if(n%2==0)
        s1=s1+s2;
        else
        s1=s1+s2-mat[n/2][n/2];
        return s1;
    }
}
