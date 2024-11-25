import java.util.Scanner;

public class tree {
     public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int c = 0;

        while (x1 - x2 >= 0) {
            x1 -= x2;
            c++;
        }
        System.out.println(c);
        System.out.println(x1);
    }
}
