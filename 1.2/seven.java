import java.util.Scanner;
 
public class seven {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        
        if ((x<y) && (y<z)) System.out.println(x+" "+y+" "+z);
        if ((y<x) && (x<z)) System.out.println(y+" "+x+" "+z);
        if ((x<z) && (z<y)) System.out.println(x+" "+z+" "+y);
        if ((z<x) && (x<y)) System.out.println(z+" "+z+" "+y);
        if ((z<y) && (y<x)) System.out.println(z+" "+y+" "+x);
        if ((y<z) && (z<x)) System.out.println(y+" "+z+" "+x);
 
    }
 
}