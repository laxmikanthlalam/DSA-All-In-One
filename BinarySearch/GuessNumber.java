/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=1,r=n,res=0;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            int ans=guess(mid);
            if(ans==0)
            {
            res=mid;
            break;
            }
            else if(ans==-1)
            {
                r=mid-1;
            }
            else if(ans==1)
            {
                l=mid+1;
            }

        }
        return res;
    }
}
