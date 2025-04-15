import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == k) {
                    flag = true;
                }
            }
            System.out.println(flag ? "Yes" : "No");
        }
    }
}