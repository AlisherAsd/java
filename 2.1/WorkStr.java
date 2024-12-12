import java.util.Arrays;

public class WorkStr {

    public static void Perevorot(String s) {
        System.out.println(new StringBuilder(s).reverse().toString());
    }

    public static void CountWord(String s) {
        int count  = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (array[i] == ' ') count++;
        }
        if (s.length() == 0) System.out.println(0);
        else System.out.println(count + 1);
    }

    public static void DeleteProbel(String s) {
        String res = "";
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (array[i] != ' ') res += array[i];
        }
        System.out.println(res);
    }

    public static void Annograma(String  str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Сравниваем отсортированные массивы
        if (Arrays.equals(charArray1, charArray2)) System.out.println(str1 + " и " + str2 + " - аннограммы.");
    }

    public static void MaxPodstrok(String  str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        int maxLength = 0; // Длина наибольшей подстроки
        int endIndex = 0; // Индекс конца наибольшей подстроки в str1

        // Заполнение таблицы динамического программирования
        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                // Если символы совпадают, увеличиваем длину подстроки
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    
                    // Обновляем максимальную длину и индекс конца подстроки
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i; // Индекс конца подстроки в str1
                    }
                } else {
                    dp[i][j] = 0; // Заносим 0 для не совпадающих символов
                }
            }
        }

        // Извлекаем наибольшую подстроку из str1
        System.out.println(str1.substring(endIndex - maxLength, endIndex));
    }

    public static void PovtorStr(String s) {
        char[] arr = s.toCharArray();
        int rescount = 0;
    
        boolean[] counted = new boolean[s.length()]; // Массив для отслеживания подсчитанных символов
    
        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) { // Если символ еще не был подсчитан
                int count = 1; // Начинаем с 1 для текущего символа
    
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // Если символы совпадают
                    count++;
                    counted[j] = true; // Отметить данный индекс как подсчитанный
                }
            }
    
            if (count >= 2) { // Если символ повторяется
                rescount++; // Увеличиваем счетчик повторяющихся символов
            }
        }
        }
    
        System.out.println("Кол-во повторяющихся символов: " + rescount);
    }

    public static int countVowels(String s) {
        // Приводим строку к нижнему регистру для упрощенного сравнения
        s = s.toLowerCase();
        int count = 0;

        // Перебираем каждый символ в строке
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // Проверяем, является ли символ гласной
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count; // Возвращаем общее количество гласных
    }

    public static void reverseWord(String s) {
        // Разбиваем строку на слова с помощью пробела
        String[] words = s.split(" ");

        String res = "";

        // Перебираем массив слов в обратном порядке
        for (int i = words.length - 1; i >= 0; i--) {
            res += words[i];
            if (i != 0) {
                res += " "; // Добавляем пробел между словами
            }
        }

        System.out.println(res); // Возвращаем перевернутую строку
    }
    public static void main(String[] args) {
        Perevorot("asd");
        CountWord("asd a asd a");
        DeleteProbel("asd a asd a");
        Annograma("aasd", "asda");
        MaxPodstrok("aaasd", "sasaaadf");
        PovtorStr("aass");
        reverseWord("Hello World");
    }
}

