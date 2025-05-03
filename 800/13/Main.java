import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int maxnum = 0, maxcount = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > maxnum) {
                    maxnum = arr[i];
                    maxcount = 1;
                } else if (arr[i] == maxnum) {
                    maxcount++;
                }
            }
            if (maxcount == n) {
                System.out.println(-1);
            } else {
                System.out.println((n - maxcount) + " " + maxcount);
                for (int i : arr) {
                    if (i != maxnum) {
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                while (maxcount-- > 0) {
                    System.out.print(maxnum + " ");
                }
                System.out.println();
            }
        }
    }
}