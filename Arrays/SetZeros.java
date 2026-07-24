class Solution {
    public void setZeroes(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
      boolean[][] arr=new boolean[r][c];
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            if(matrix[i][j]==0)
            {
                arr[i][j]=true;
            }
        }
      }
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
            if(arr[i][j])
            {
                for(int k=0;k<c;k++)
                {
                    matrix[i][k]=0;
                }
                for(int k=0;k<r;k++)
                {
                    matrix[k][j]=0;
                }
            }
        }
      }
    }
}
