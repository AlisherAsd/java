import java.util.Arrays;
import java.util.Scanner;

public class zmeika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ii = in.nextInt();
        int jj = in.nextInt();
        int[][] matrix = new int[ii][jj];

        for (int i = 0; i < ii; i++) {
            for (int j = 0; j < jj; j++) {
                if (i != 0 && i % 2 != 0)  matrix[i][jj - j - 1] = in.nextInt();
                else matrix[i][j] = in.nextInt();
            }
        }

        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);

    }
}
