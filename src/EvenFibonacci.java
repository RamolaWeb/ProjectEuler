import java.io.InputStreamReader;
import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            long n = scanner.nextLong();
            long f2 = 2;
            long f1 = 8;
            long sum = 10;
            while (true) {
                long fn = 4*f1 + f2;
                if(fn > n) {
                    break;
                }
                sum += fn;
                f2 = f1;
                f1 = fn;
            }
            System.out.println(sum);
        }
    }
}
