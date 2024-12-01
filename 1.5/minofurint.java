
class MyMath {
    static public int min(int x1, int x2, int x3, int x4) {
        int[] arr = { x1, x2, x3, x4 };
        int min = 1000000000;
        for (int i = 0; i < 4; i++) {
            if (arr[i] <= min) min = arr[i];
        }

        return min;
    }
}


public class minofurint {
    public static void main(String[] args) {
       System.out.println(MyMath.min(4, 5, 6, 7));
    }
}
