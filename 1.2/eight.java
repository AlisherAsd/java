import java.util.Scanner;

public class eight {
        public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        if (month <= 0 || month > 12) {
            System.out.println(0);
        } else {
            System.out.println(year[month - 1]);
        }
    }
}
