import java.util.*;

public class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            digits.add(sc.nextInt());
        }

        int carry = 1;

        for (int i = digits.size() - 1; i >= 0; i--) {
            int sum = digits.get(i) + carry;
            digits.set(i, sum % 10);
            carry = sum / 10;

            if (carry == 0) break; // early stop
        }

        if (carry == 1) {
            digits.add(0, 1);
        }

        for (int d : digits) {
            System.out.print(d + " ");
        }
    }
}
