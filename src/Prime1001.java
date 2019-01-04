import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Prime1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        boolean num[] = new boolean[110001];
        for(int i=0;i<=110000;i++) {
            num[i] = true;
        }
        num[0] = false;
        num[1] = false;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2;i*i<=110000; i++) {
            if(num[i] == true) {
                for(int j = i*i;j<=110000; j+=i){
                    num[j] = false;
                }
            }
        }
        for (int i=2;i<=110000;i++) {
            if(num[i] == true) {
                list.add(i);
            }
        }

        int t = scanner.nextInt();
        while (t -- > 0) {
            int n = scanner.nextInt();
            System.out.println(list.get(n-1));
        }
    }
}
