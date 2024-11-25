import java.util.Scanner;

public class prostchisla {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int c = 0;
        int cg = 0;
        if (a <= b && b <=  10000) {
            for (int i = a; i <= b; i++) {
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        c++;
                    } 
                }
                if (c == 2) {
                    System.out.println(i);
                    cg++;
                }
                c = 0;
            }
        }
        if (cg == 0) {
            System.out.println(0);
        }
    }
}
