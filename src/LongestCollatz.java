import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class LongestCollatz {

    public static void main(String[] args) {
        HashMap<Integer, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long maxCount = 0;
            int maxIndex = 0;
            for (int i=1; i<=n; i++) {
                long count = LongestCollatz.collatz(map, i);
                if (count >= maxCount){
                    maxCount = count;
                    maxIndex = i;
                }
            }
            System.out.println(maxIndex);
        }
    }

    public static long collatz (HashMap<Integer, Long> store, int num) {
        if (num <= 1) return 1;
        if (num % 2 == 0) {
            if(store.containsKey(num)) {
                return store.get(num);
            }
            long count = 1 + collatz(store, num/2);
            store.put(num, count);
            return count;
        }
        else {
            if(store.containsKey(num)){
                return store.get(num);
            }
            long count = 1 + collatz(store, 3*num+1);
            store.put(num, count);
            return count;
        }
    }
}
