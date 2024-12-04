import java.util.Scanner;

class tree0 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int x = 1;
        int sum = 0;
        while (x % 5 != 0) {
            x = in.nextInt();
            if (x > 10) sum += x;
        }

        System.out.println(sum);
    }
}