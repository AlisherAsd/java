import java.util.Scanner;

public class DaysUntilNewYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите день (1-31): ");
        int day = scanner.nextInt();

        // Проверка на корректность введенных данных
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println(-1);
            return;
        }

        // Определение количества дней в каждом месяце
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Проверка на корректность дня для указанного месяца
        if (day > daysInMonth[month]) {
            System.out.println(-1);
            return;
        }

        // Подсчет оставшихся дней до Нового года
        int daysUntilNewYear = 0;
        for (int i = month + 1; i <= 12; i++) {
            daysUntilNewYear += daysInMonth[i];
        }
        daysUntilNewYear -= day; // Вычитаем уже прошедшие дни в текущем месяце

        System.out.println("Количество дней до Нового года: " + daysUntilNewYear);
    }
}