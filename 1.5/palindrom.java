public class palindrom {
    
    public static void CountWord(String s) {
       
        String res = "";
        char[] array = s.toCharArray();
        for (int i = s.length() - 1; i != -1; i--) {
            res += array[i]; 
        }
        System.out.println(s + " : " + res);
    }
    public static void main(String[] args) {
        CountWord("asd");
    }
}