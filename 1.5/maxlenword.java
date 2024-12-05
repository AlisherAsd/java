public class maxlenword {
    
    public static void CountWord(String s) {
        int count  = 0;
        int max = -1;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (array[i] != ' ') {
                count++;
            }
            else {
                count = 0;
            }
            if (max <= count) max = count;
        }
        if (s.length() == 0) System.out.println(0);
        System.out.println(max);
    }
    public static void main(String[] args) {
        CountWord("asd sadasd sd sdsd sds aaaaaaaaaa");
    }
}