public class palindrom {
    
    public static void CountWord(String s) {
       
        int count = 0;
        char[] array = s.toCharArray();
        for (int i = s.length() - 1; i != -1; i--) {
            if (array[s.length() - 1 - i] != array[i]) {
                count = 0;
            }
            if (array[s.length() - 1 - i] == array[i]) {
                count++;
            }
        }
        if (count == s.length()) System.out.println("yes");
        else System.out.println("no");

    }
    public static void main(String[] args) {
        CountWord("aaa");
    }
}