import java.util.*;

class EasyPronouniation {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();   // length (not mandatory)
            String s = in.next();

            int count = 0;
            boolean hard = false;   // 🔑 FLAG

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count = 0;
                } else {
                    count++;
                    if (count == 4) {
                        hard = true;
                        break;
                    }
                }
            }

            if (hard)
                System.out.println("NO");
            else
                System.out.println("YES");
        }

        in.close();
    }
}
