import java.util.Scanner;

class five {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        double num = in.nextFloat();
        if (-1000 <= num && num <= 1000) {
            System.out.println(!((-2 <= num && num <= 3) || (6 <= num && num <= 9)));
        }
        in.close();
    }
}