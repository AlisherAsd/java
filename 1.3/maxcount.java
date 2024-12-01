import java.util.Scanner;

class maxcount {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Len: ");
        int n = in.nextInt();
        int[] arr = new int[n];   
        for (int i = 0; i < n; i++) {
            System.out.println("Enter el " + i + ": ");
            arr[i] = in.nextInt();  
        }
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == max) {
                count++;
            }
        }

        System.out.println("Kol-vo max: " + count);
    }
}