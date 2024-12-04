import java.util.Arrays;
import java.util.Scanner;

public class povorot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ii = in.nextInt();
        int jj = in.nextInt();
        int[][] matrix = new int[ii][jj];

        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                matrix[i][j] = matrix[j][i];
            }
        }

        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);


    }
}
