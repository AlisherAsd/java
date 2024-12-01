import java.util.Arrays;
import java.util.Scanner;

class matrixij {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ii = in.nextInt();
        int jj = in.nextInt();
        int[][] matrix = new int[ii][jj];

        for (int i = 0; i < ii; i++) {
            matrix[i/ii][i%jj] = (i/ii)*(i%jj);
            System.out.println(i/ii + " " + i%jj);
        }
       
      
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
        
    }
}