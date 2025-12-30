//Leet Code problem no:1295
class EvenNumbers{
    public static void main(String[] args) {
        int[] nums = {437,315,322,431,686,264,442};
        int ans = findNumbers(nums);
        System.out.println("Number of elements that are even no od digits are:"+ans);
    }
    public static int findNumbers(int[] nums) {
        int c=0,d=0;
      for(int i=0;i<nums.length;i++){
        while(nums[i]!=0)
        {

            nums[i]=nums[i]/10;
            c++;
        }
        if(c%2==0)
        {
            d++;
        }
        c=0;

      }
    return d;
    }
}
