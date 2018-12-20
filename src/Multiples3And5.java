import java.io.InputStreamReader;
import java.util.Scanner;

public class Multiples3And5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long x = n/3;
            long y = n/5;
            long z = 0;
            if(n%3 == 0 ) x -= 1;
            if(n%5 == 0) y -= 1;
            long tot3 = 0, tot5 = 0, tot15=0;
            if(x > 0 ) {
                tot3 = (3*(x)*(x+1))/2;
            }
            if(y > 0) {
                tot5 = (5*(y)*(y+1))/2;
            }
            if(n >= 15) {
                z = n/15;
                if(n%15 == 0) {
                    z -= 1;
                }
            }
            if(z > 0) {
                tot15 = (15*(z)*(z+1))/2;
            }

            long tot = tot3 + tot5 - tot15;
            System.out.println(tot);
        }
    }
}
