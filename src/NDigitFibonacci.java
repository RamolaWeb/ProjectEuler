import java.io.InputStreamReader;
import java.util.Scanner;

public class NDigitFibonacci {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println(1);
            }
            else {
                int c = 0;
                int index = 1;
                while (c != n) {
                    double count = (index * Math.log10(1.6180339887498948)) -
                            ((Math.log10(5)) / 2);
                    c = (int) Math.ceil(count);
                    index++;
                }
                System.out.println(index-1);
            }
        }
    }
}
