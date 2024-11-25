import java.util.Arrays;
import java.util.Scanner;

class diagmatr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - i - 1 == j) matrix[i][j] = 1;
                if (n - i - 1 > j) matrix[i][j] = 0;
                if (n - i - 1 < j) matrix[i][j] = 2;
            }
        }
       
      
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
        
    }
}