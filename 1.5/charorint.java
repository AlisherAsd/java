public class charorint {
    public static void main(String[] args) {
       
        char testChar = 'a'; 
        boolean result = isDigit(testChar);
        System.out.println("Is '" + testChar + "' a digit? " + result);
    }

    public static boolean isDigit(char c) {
        return Character.isDigit(c);
    }
}
