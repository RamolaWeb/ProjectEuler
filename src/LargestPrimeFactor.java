import java.io.InputStreamReader;
import java.util.Scanner;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            System.out.println(maxPrimeFactor(n));
        }
    }

    public static long maxPrimeFactor(long n) {
        long num = 0;
        long k = n;
        while (k % 2 == 0) {
            num = Math.max(2,num);
            k /= 2;
        }
        for(long i = 3; i<= Math.sqrt(k); i+=2) {
            while (k % i == 0) {
                num = Math.max(i,num);
                k /= i;
            }
        }
        if (k > 2 ) {
            num = Math.max(k, num);
        }
        return num;
    }
}
