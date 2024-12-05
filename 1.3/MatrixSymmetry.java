import java.util.Scanner;

public class MatrixSymmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность матрицы (N x N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        boolean isSymmetric = true;

        // Проверка симметричности относительно главной диагонали
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
            }
            }
        }

        // Вывод результата
        if (isSymmetric) {
            System.out.println("Матрица симметрична относительно главной диагонали.");
        } else {
            System.out.println("Матрица не симметрична.");
        }
    }
}