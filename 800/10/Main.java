import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int positive = 0, negative = 0;
            for (int i = 0; i < n - 1; i++) {
                int ele = sc.nextInt();
                if (ele > 0)
                    positive += ele;
                else
                    negative += ele;
            }
            System.out.println((positive + negative) * -1);
        }
    }
}
