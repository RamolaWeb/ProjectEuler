import java.io.InputStreamReader;
import java.util.Scanner;

public class HighlyDivisbleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int num = 1;
            int d = 1;
            while (HighlyDivisbleTriangle.divisor(d) <= n) {
                num++;
                d += num;
            }
            System.out.println(d);
        }
    }

    public static int divisor(int n) {
        int count = 1;
        int c = 0;
        int num = n;
        while (num % 2 == 0) {
            c++;
            num /= 2;
        }

        if(c !=0)
         count *= c+1;

        for (int i=3; i<=Math.sqrt(num); i+=2) {
            c = 0;
            while (num % i == 0) {
                c++;
                num /=i;
            }
            if (c != 0)
             count *= c+1;
        }

        if (num > 2) {
            count *= 2;
        }
        return count;
    }
}
