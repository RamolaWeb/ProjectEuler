import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonAbundant {

    public static void main(String[] args) {
        int N = 100000;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=1; i <= N; i++) {
            int sum = 1;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {
                    if (i/j == j) {
                        sum += i/j;
                    }
                    else {
                        sum += j + i/j;
                    }
                }
            }
            if (sum > i) {
                map.put(i, sum);
            }
         }

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            boolean isFound = false;
            for (int i=1; i<n; i++) {
                if (map.containsKey(i) && map.containsKey(n-i)) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
