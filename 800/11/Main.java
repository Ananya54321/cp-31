import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int points = 0;
            for (int i = 1; i <= 10; i++) {
                String inp = sc.next();
                for (int j = 1; j <= 10; j++) {
                    if (inp.charAt(j - 1) == 'X') {
                        points += clacPoints(i, j);
                    }
                }
            }
            System.out.println(points);
        }
    }

    public static int clacPoints(int i, int j) {
        if (i == 1 || j == 1 || j == 10 || i == 10) {
            return 1;
        } else if (i == 2 || j == 2 || i == 9 || j == 9) {
            return 2;
        } else if (i == 3 || j == 3 || i == 8 || j == 8) {
            return 3;
        } else if (i == 4 || j == 4 || i == 7 || j == 7) {
            return 4;
        } else
            return 5;
    }
}
