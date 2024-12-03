import java.util.Scanner;


class ClassPoint {

    public int x;
    public int y;

    ClassPoint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        this.x = scanner.nextInt();
        System.out.println("\nВведите y: ");
        this.y = scanner.nextInt();
    }

    ClassPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void chetvert() {
        if (x > 0 && y > 0) System.out.println("1 четверть");
        if (x > 0 && y < 0) System.out.println("4 четверть");
        if (x < 0 && y > 0) System.out.println("2 четверть");
        if (x < 0 && y < 0) System.out.println("3 четверть");
    }

    public static boolean simmetria(ClassPoint a, ClassPoint b) {
        return (Math.abs(a.y) == Math.abs(b.y) && Math.abs(a.x) == Math.abs(b.x));
    }   

    public static boolean isCollinear(ClassPoint a, ClassPoint b, ClassPoint c) {
        return (a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) == 0;
    }
}


public class point {
    public static void main(String[] args) {
        ClassPoint a = new ClassPoint(2, 3);
        ClassPoint b = new ClassPoint(-2, -3);
        ClassPoint c = new ClassPoint(-4, -6);
        a.chetvert();
        System.out.println(ClassPoint.simmetria(a, b));
        System.out.println(ClassPoint.isCollinear(a, b, c));
    }
}
