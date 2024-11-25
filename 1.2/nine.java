import java.util.Scanner;

public class nine {
    public static void main(String[] args) {

        Scanner in = new Scanner( System.in ); 
        int c = 0; 
        int n = in.nextInt(); 
        while (n>0 && n < 109) { 
            if (n%2==1) { 
                c++; 
                System.out.print(n%10); 
                break; 
            } 
            n=n/10; 
        } 
        if (c==0) { 
            System.out.print("NO"); 
        } 

    }
}