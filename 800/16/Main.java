import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int prev = sc.nextInt();
            int mindiff = Integer.MAX_VALUE;
            for (int i = 1; i < n; i++) {
                int ele = sc.nextInt();
                mindiff = Math.min(ele - prev, mindiff);
                prev = ele;
            }
            if (mindiff < 0) {
                System.out.println(0);
            } else
                System.out.println(mindiff / 2 + 1);
        }
    }
}