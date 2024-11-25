import java.util.Scanner;

class tree {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = in.nextInt();
        if (num >= 0 && num < 10) {
            System.out.print("DIGIT");
        }
        else if (num >= 10 && num < 100) {
            System.out.print("NUM");
        }
        else {
            System.out.print("OTHER");
        }
        in.close();
    }
}