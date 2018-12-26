import java.io.InputStreamReader;
import java.util.Scanner;

public class SmallestMultiple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long ans = 1l;
            for(long i=1;i<=n;i++) {
                ans = (ans * i)/(gcd(ans, i));
            }
            System.out.println(ans);
        }
    }

    public static long gcd (long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
}
