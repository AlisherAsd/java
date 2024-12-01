

class Geom {

    public static double sigmentLenght(int x1, int x2, int y1, int y2) {
        double res = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return res;
    } 
    
    public static double trianglePerimetr(int x1, int x2, int x3, int y1, int y2, int y3) {
        double a = Geom.sigmentLenght(x1, x2, y1, y2);
        double b = Geom.sigmentLenght(x2, x3, y2, y3);
        double c = Geom.sigmentLenght(x3, x1, y3, y1);
        return a + b + c;
    } 
    
}
    
    
class perimetrtr {
    public static void main(String[] args) {
    
    System.out.println(Geom.trianglePerimetr(0, 0, 1, 0, 0, 1));
    System.out.println(Geom.trianglePerimetr(-2, -4, -3, -4, -1, 1));

    }
}