import java.io.InputStreamReader;
import java.util.Scanner;

public class LatticePaths {

    public static void main(String[] args) {
        int totN = 500;
        int totM = 500;

        long count[][] = new long[totN+1][totM+1];

        for (int i=0; i<=totN; i++) {
            count[i][0] = 1l;
        }

        for (int i=0; i<=totN; i++) {
            count[0][i] = 1l;
        }

        for (int i=1; i<=totN; i++) {
            for (int j=1; j<=totM; j++) {
                count[i][j] = (count[i-1][j] + count[i][j-1]) % (1000000007);
            }
        }

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(count[n][m]);
        }
    }
}
