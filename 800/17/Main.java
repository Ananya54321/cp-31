import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();
            if (x != 1) {
                System.out.println("YES");
            } else if (k == n || n % 2 == 0) {
                System.out.println("YES");
            } else if (k < 3) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}