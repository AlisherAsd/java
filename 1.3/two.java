import java.util.Scanner;

public class two {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int x = 10;
        int d = 0;
        int s = 0;
        while (x >= 10 && x <= 99) {
            x = in.nextInt();
            if (x >= 10 && x <= 99) {
                d += x / 10;
                s += x % 10;
            }
        }

        System.out.println(d + s);
    }
}
