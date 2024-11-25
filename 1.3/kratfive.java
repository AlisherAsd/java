import java.util.Scanner;

public class kratfive {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int x1 = 2;
        int c = 0;

        while (x1 % 5 != 0) {
            x1 = in.nextInt();
            if (x1 > 10) {
                c += x1;
            }
        }
        System.out.println(c);
    }
}
