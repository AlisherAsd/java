import java.util.Locale;

class vector2D {
    public double vX;
    public double vY;

    public vector2D() {
        vX = 1;
        vY = 1;
    }
    public vector2D(double x, double y) {
        vX = x;
        vY = y;
    }
    public vector2D(vector2D p) {
        this(p.vX, p.vY);
    }
    public void print() {
        System.out.println("(" + String.format(Locale.US, "%.2f", vX) + ", " + String.format(Locale.US, "%.2f", vY) + ")");
    }
    public double lenght() {
        double res = Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
        return res;
    }
    public void add(vector2D v) {
        vX += v.vX;
        vY += v.vY;
    }
    public void sub(vector2D v) {
        vX -= v.vX;
        vY -= v.vY;
    }
    public void scale(double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }
}


public class vectortwod {
    public static void main(String[] args) {
        vector2D v = new vector2D(1.2374, 2.2334);
        v.print();
        vector2D v2 = new vector2D(v);
        v2.print();
        vector2D v3 = new vector2D();
        System.out.println(v3.lenght());
        v.add(v3);
        v.print();
        v.scale(2);
        v.print();
    }
}
