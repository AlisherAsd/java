import java.util.Scanner;

public class four {
    public static void main(String[] args) {
         
        Scanner in = new Scanner(System.in);
        int month = in.nextInt();
        int day = in.nextInt();
        int[] year = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
        if (day <= 0 || month <= 0 || month > 12 || day > year[month - 1]) {
            System.out.println(-1);
        } else {
            int days = year[month - 1] - day;
            while (month < 12) {
                days += year[month++];
            }
            System.out.println(days);
        }
    }
}
