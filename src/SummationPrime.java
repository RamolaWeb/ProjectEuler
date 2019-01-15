import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class SummationPrime {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        boolean prime[] = new boolean[2000001];
        for (int i=0; i<=2000000; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;

        for (int i=2; i*i <= 2000000 ; i++) {
            if (prime[i]) {
                for (int j = i*2; j<=2000000; j+= i) {
                    prime[j] = false;
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i=2;i <=2000000; i++) {
            if(prime[i]) {
                list.add(i);
            }
        }

        while (t-- > 0) {
            int n = scanner.nextInt();
            long sum = 0l;
            for (int i : list) {
                if(i <= n) {
                    sum += i;
                }
                else {
                    System.out.println(sum);
                    break;
                }
            }
            System.out.println(sum);
        }
    }
}
