import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int anna = (c / 2) + (c % 2);
            int katie = c - anna + b;
            anna = anna + a;
            System.out.println(anna > katie ? "First" : "Second");
        }
    }
}
