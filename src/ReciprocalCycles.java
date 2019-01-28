import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReciprocalCycles {

    public static void main (String[] args) {
        int count[] = new int[10000];
        for (int i=1; i<10000; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            ArrayList<Integer> list = new ArrayList<>();

            int rem = 1 % i;
            if(rem == 0) {
                count[i] = 0;
                continue;
            }
            int value;
            while (!map.containsKey(rem)) {
                map.put(rem, list.size());
                rem *= 10;
                value = rem / i;
                rem = rem % i;
                list.add(value);
            }
            if (rem != 0) {
                int index = map.get(rem);
                count[i] = list.size() - index;
            }
            else {
                count[i] = 0;
            }

        }

        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int i=1; i<n; i++) {
                if(count[i] > max) {
                    max = count[i];
                    index = i;
                }
            }

            System.out.println(index);
        }
    }
}
