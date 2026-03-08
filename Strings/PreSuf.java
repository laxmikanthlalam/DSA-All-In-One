import java.util.*;

public class PreSuf {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String S = in.next();
        String T = in.next();

        if(S.startsWith(T) && S.endsWith(T))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
