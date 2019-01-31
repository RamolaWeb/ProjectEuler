import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AmicableNumber {

    public static void main (String[] args) {
        int N = 100000;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=1; i<=N; i++) {
            int sum = 1;
            for (int j=2; j*j <=i; j++) {
                if (i % j == 0) {
                    if (j == i/j) {
                        sum += j;
                    }
                    else {
                        sum += j + (i/j);
                    }
                }
            }
            map.put(i, sum);
        }

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i=1; i<n; i++) {
                int a = map.get(i);
                if (map.containsKey(a)) {
                    int b = map.get(a);
                    if (i == b && a != b) {
                        sum += i;
                    }
                }
            }
            System.out.println(sum);
        }
    }
}
