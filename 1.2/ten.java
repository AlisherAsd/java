import java.util.Scanner;

public class ten {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int min = 1000000;
        while (a > 0) {
            if (a % 10 < min && a != 0) {
                min = a % 10;
            }
            a = a / 10;
        }

        System.out.println(min);
    }
}





