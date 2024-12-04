import java.util.Scanner;

public class VlozhCiklu {

    static public void PovtorCifr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.nextLine();

        boolean hasRepeats = false;

        // Внешний цикл
        for (int i = 0; i < number.length(); i++) {
            char currentDigit = number.charAt(i);
            // Внутренний цикл
            for (int j = i + 1; j < number.length(); j++) {
                if (currentDigit == number.charAt(j)) {
                    hasRepeats = true;
                    break;
                }
            }
            if (hasRepeats) {
                break;
            }
        }

        // Вывод результата
        if (hasRepeats) {
            System.out.println("В числе есть повторяющиеся цифры.");
        } else {
            System.out.println("Повторяющихся цифр нет.");
        }
    }

    static public void NOD() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        
        // Предполагаем, что НОД равен 1, и ищем наибольший общий делитель
        int gcd = 1;
        
        // Находим минимальное из двух чисел
        int min = Math.min(a, b);
        
        // Цикл для нахождения НОД
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i; // обновляем НОД
            }
        }
        
        // Вывод результата
        System.out.println("Наибольший общий делитель: " + gcd);
    }
    public static void main(String[] args) {
        PovtorCifr();
        NOD();
    }   
}
