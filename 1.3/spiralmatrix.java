import java.util.Scanner;

public class spiralmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод размерности матрицы
        System.out.print("Введите размерность матрицы (N x N): ");
        int n = scanner.nextInt()*2 + 1;

        // Создание матрицы
        int[][] matrix = new int[n][n];

        // Направления: вверх, влево, вниз, вправо
        int[][] directions = {
            {-1, 0}, // вверх
            {0, -1}, // влево
            {1, 0},  // вниз
            {0, 1}   // вправо
        };

        // Начальные координаты (центр матрицы)
        int x = n / 2;
        int y = n / 2;

        

        // Заполнение матрицы
        for (int number = 1; number <= n * n; number++) {
            matrix[x][y] = number; // Заполнение текущей ячейки

            // Перемещение в следующем направлении
            for (int[] direction : directions) {
                int nextX = x + direction[0];
                int nextY = y + direction[1];

                // Проверка, если следующая позиция в пределах матрицы и не заполнена
                while (nextX >= 0 && nextY >= 0 && nextX < n && nextY < n && matrix[nextX][nextY] == 0) {
                    x = nextX;
                    y = nextY;
                    matrix[x][y] = number + 1;

                    // Обновление следующей позиции
                    nextX += direction[0];
                    nextY += direction[1];
                    number++;
                }
            }
        }

        // Вывод матрицы
        System.out.println("Заполненная спиральная матрица:");
        printMatrix(matrix);
    }

    // Метод для вывода матрицы
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}