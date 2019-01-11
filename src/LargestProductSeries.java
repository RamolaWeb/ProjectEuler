import java.util.*;

public class LargestProductSeries {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++)
        {
            int n = in.nextInt();
            int k = in.nextInt();
            String num = in.next();
            long product=0,prom=1;
            for(int j=0;j<=n-k;j++)
            {
                String test=num.substring(j,j+k);
                for(int k1=0;k1<test.length();k1++)
                {
                    prom*=Integer.valueOf(test.charAt(k1)+"");
                }
                if(prom>product)
                {
                    product=prom;
                }
                prom=1;
            }
            System.out.println(product);
            product=0;

        }
    }
}