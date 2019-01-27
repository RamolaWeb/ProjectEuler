import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class PowerDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            int borrow = 0;
            for (int i=1; i<=n-1; i++) {
                int tot = 2 * list.get(0);
                int sum = tot % 10;
                borrow = tot / 10;
                list.set(0, sum);
                for (int j=1; j < list.size(); j++) {
                    tot = borrow + ( 2 * list.get(j));
                    sum = tot % 10;
                    borrow = tot / 10;
                    list.set(j, sum);
                }
                list.add(borrow);
            }
            list.add(borrow);
            long sum = 0l;
            for (int i : list) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
