import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int count = 0;
            int ones = 0, twos = 0;
            boolean moreThanTwo = false;
            for (char ch : s.toCharArray()) {
                if (ch == '.')
                    count++;
                else {
                    if (count == 1)
                        ones++;
                    else if (count == 2)
                        twos++;
                    else if (count > 2) {
                        moreThanTwo = true;
                        break;
                    }
                    count = 0;
                }
            }

            if (moreThanTwo || count > 2) {
                System.out.println(2);
            } else {
                System.out.println(ones + twos * 2 + count);
            }
        }
    }
}