import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NamesScore {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n = Integer.parseInt(reader.readLine());
            ArrayList<String> name = new ArrayList<>();
            for (int i=0; i<n; i++) {
                name.add(reader.readLine());
            }
            Collections.sort(name);
            int q = Integer.parseInt(reader.readLine());
            for (int i=0; i<q; i++) {
                String s = reader.readLine();
                int index = name.indexOf(s);
                if (index != -1) {
                    int sum = 0;
                    for (int k=0; k<s.length(); k++) {
                        sum += (s.charAt(k) - 'A')+1;
                    }
                    System.out.println(sum*(index+1));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
