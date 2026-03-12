import java.util.*;
class SortAlphabet{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.next();
        char a[]=s.toCharArray();
        Arrays.sort(a);
        System.out.println(a);
    }
}
