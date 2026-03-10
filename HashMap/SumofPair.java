import java.util.*;

public class SumofPair {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int arr[] = new int[n];

        HashSet<Integer> set = new HashSet();

        boolean f = false;

        for(int i = 0; i < n; i++) {

            arr[i] = in.nextInt();

            int s = k - arr[i];

            if(set.contains(s)) {
                f = true;
            }

            set.add(arr[i]);
        }

        if(f)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
