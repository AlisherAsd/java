import java.util.Scanner;

class one {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        double num = in.nextFloat();
        if (-1000 <= num && num <= 1000) {
            System.out.println(3 <= num && num <= 8);
        }
        in.close();
    }
}