import java.util.Scanner;

class six {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input x number: ");
        double x = in.nextFloat();
        System.out.print("Input y number: ");
        double y = in.nextFloat();
        if ((-1000 <= x && x <= 1000) && (-1000 <= y && y <= 1000)) {
            if (y < x && x < 2 && (x * x + y * y > 4)) {
                System.out.print("YES");
            } else {
                System.out.print("NO");
            }
        }
        in.close();
    }
}