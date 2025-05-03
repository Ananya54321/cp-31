import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int odd = 0;
            for (int i = 0; i < n; i++) {
                int ele = sc.nextInt();
                if (ele % 2 == 1)
                    odd++;
            }
            System.out.println((odd % 2 == 0) ? "Yes" : "No");
        }
    }
}