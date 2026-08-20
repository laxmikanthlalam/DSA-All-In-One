class Solution {
    public boolean isValidSudoku(char[][] board) 
    {

        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')
                continue;
                if(!set.contains(board[i][j]))
                {
                    set.add(board[i][j]);
                }
                else
                {
                    return false;
                }
            }
            set.clear();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[j][i]=='.')
                continue;
                if(!set.contains(board[j][i]))
                {
                    set.add(board[j][i]);
                }
                else
                {
                    return false;
                }
            }
            set.clear();
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                for(int n=i;n<(i+3);n++)
                {
                    for(int m=j;m<(j+3);m++)
                    {
                        if(board[n][m]=='.')
                        continue;
                        if(!set.contains(board[n][m]))
                        {
                            set.add(board[n][m]);
                        }
                        else
                        {
                            return false;
                        }
                    }
                }
                set.clear();
            }
        }
        return true;


    }
}
