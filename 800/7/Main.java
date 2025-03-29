import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            int temp = n;
            while (n <= m) {
                x = x + x;
                n = n + n;
            }
            x = x + x;
            n = n + n;
            int i = x.indexOf(s);
            if(i==-1){
                System.out.println(-1);
                continue;
            }
            i = i+m;
            int count = 0;
            while(temp<i){
                temp = temp+temp;
                count++;
            }
            System.out.println(count);
        }
    }
}
