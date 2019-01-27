import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargeSum {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int t = Integer.parseInt(reader.readLine());
            String num[][] = new String[t][50];
            for (int i=0; i<t; i++) {
                String s = reader.readLine();
                for (int j=0; j<s.length(); j++) {
                    num[i][j] = s.substring(j,j+1);
                }
            }
            int borrow = 0;
            int tot[] = new int[50];
            for (int j=49; j >= 0; j--) {
                int sum = 0;
                for (int i = 0; i < t; i++) {
                    sum += Integer.parseInt(num[i][j]);
                }
                tot[j] = (sum + borrow) % 10;
                borrow =  (sum + borrow) / 10;
            }

            StringBuilder builder = new StringBuilder(""+borrow);
            if (builder.length() < 10) {
                int index = builder.length();
                for (int i = 0; i<10-index; i++)
                  builder.append(tot[i]);
            }
            System.out.println(builder.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
