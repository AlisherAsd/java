public class countword {
    
    public static void CountWord(String s) {
        int count  = 0;
        char[] array = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (array[i] == ' ') count++;
        }
        if (s.length() == 0) System.out.println(0);
        else System.out.println(count + 1);
    }
    public static void main(String[] args) {
        CountWord("asd sadasd");
    }
}
