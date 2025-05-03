import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> res = new ArrayList<>();
            res.add(sc.nextInt());
            int prev = res.get(0);
            for (int i = 1; i < n; i++) {
                int ele = sc.nextInt();
                res.add(ele);
                if (ele < prev) {
                    res.add(ele);
                }
                prev = ele;
            }
            System.out.println(res.size());
            for (int i : res) {
                System.out.print(i + " ");
            }
            System.out.println();

        }
    }
}
