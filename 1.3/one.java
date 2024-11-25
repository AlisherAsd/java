import java.util.Scanner;

class one {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int x = 2;
        int c = 0;
        while (x >= 0) {
            x = in.nextInt();
            c++;
        }

        System.out.println(c);
    }
}