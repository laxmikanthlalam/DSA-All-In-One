//1st approach
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] ans = new int[digits.length + 1];
        ans[0] = 1;
        return ans;
    }
}


//2nd approach
class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        if(digits[n-1]<9)
        {
            digits[n-1]+=1;
            return digits;
        }
        else
        {
            int x=n-2;
            while(x>=0 && digits[x]==9)
            {
                x--;
            }
            if(x==-1)
            {
                int arr[]=new int[n+1];
                arr[0]=1;
                return arr;
            }
            digits[x]++;
            for(int i=x+1;i<n;i++)
            {
               digits[i]=0;
            } 
            


        }
        return digits;
    }
}
