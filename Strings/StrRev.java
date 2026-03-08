import java.util.*;
class StrRev2{
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.next();
    int k=in.nextInt();
    k = Math.min(k, s.length());
    String rev="";
    for(int i=0;i<k;i++)
    {
      rev=s.charAt(i)+rev;
    }
    String sub=rev+s.substring(k);
    System.out.println(sub);
    String ans=reverseStr(s,k);
    System.out.println(ans);
    }
    //2nd approach 
    public static String reverseStr(String s, int k) {

        char arr[] = s.toCharArray();

        for(int i = 0; i < arr.length; i += 2*k)
        {
            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while(left < right)
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }
}
