import java.io.InputStreamReader;
import java.util.Scanner;

public class SumSquareDifference {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long diff = (n*(n+1)*(3*n+2)*(n-1))/12;
            System.out.println(diff);
        }
    }
}
