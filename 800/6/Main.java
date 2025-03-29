import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            HashMap<Integer, Integer> hm = new HashMap<>();
            int ele = 0;
            for (int i = 0; i < n; i++) {
                ele = sc.nextInt();
                hm.put(ele, hm.getOrDefault(ele, 0) + 1);
            }
            if (n == 2 || hm.size() == 1)
                System.out.println("YES");
            else if (hm.size() == 2) {

                if (n % 2 == 1 && (hm.get(ele) == (n / 2) || hm.get(ele) == (n / 2) + 1)) {
                    System.out.println("YES");
                } else if (n % 2 == 0 && hm.get(ele) == (n / 2))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else
                System.out.println("NO");
        }
    }
}