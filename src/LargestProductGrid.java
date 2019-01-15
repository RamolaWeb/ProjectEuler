import java.util.Scanner;

public class LargestProductGrid {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }

        long maxSum = 0l;
        for (int i=0; i<20; i++) {
            for (int j=0;j<=16 ;j++)  {
                long sum = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                maxSum = Math.max(maxSum, sum);
            }
        }

        for (int i=0; i<20; i++) {
            for (int j=0;j<=16 ;j++)  {
                long sum = grid[j][i]*grid[j+1][i]*grid[j+2][i]*grid[j+3][i];
                maxSum = Math.max(maxSum, sum);
            }
        }

        for (int i=0; i<20; i++) {
            for (int j=0;j<=16 ;j++)  {
                long sum = grid[i][19-j]*grid[i][18-j]*grid[i][17-j]*grid[i][16-j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        for (int i=0; i<20; i++) {
            for (int j=0;j<=16 ;j++)  {
                long sum = grid[19-j][i]*grid[18-j][i]*grid[17-j][i]*grid[16-j][i];
                maxSum = Math.max(maxSum, sum);
            }
        }

        for (int i=0;i <=16;i++) {
            for (int j=0; j<=16-i;j++) {
                long sum = grid[j][i+j]*grid[j+1][i+j+1]*grid[j+2][i+j+2]*grid[j+3][i+j+3];
                maxSum = Math.max(maxSum, sum);
            }
        }

        for (int i=0;i <=16;i++) {
            for (int j=0; j<=16-i;j++) {
                long sum = grid[19-j][19-i-j]*grid[18-j][18-i-j]*grid[17-j][17-i-j]*grid[16-j][16-i-j];
                maxSum = Math.max(maxSum, sum);
            }
        }

        System.out.println(maxSum);
    }
}
