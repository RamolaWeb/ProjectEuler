import java.io.InputStreamReader;
import java.util.*;

public class LargestPalindromeProduct {

    public static boolean isPalindrome(int nr) {
        int rev = 0;                    // the reversed number
        int x = nr;                     // store the default value (it will be changed)
        while (x > 0) {
            rev = 10 * rev + x % 10;
            x /= 10;
        }
        return nr == rev;               // returns true if the number is palindrome
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int max = -1;

            for ( int i = 999 ; i >= 100 ; i--) {
                for (int j = 999 ; j >= 100 ; j-- ) {
                    int p = i * j;
                    if ( p < n && isPalindrome(p) ) {
                        max = Math.max(max, p);
                    }
                }
            }
            System.out.println(max);
        }
    }
}
