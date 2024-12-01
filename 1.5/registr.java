public class registr {
    public static void main(String[] args) {
        char testChar1 = 'a';
        char testChar2 = 'Z'; 
        System.out.println(changeCase(testChar1));
        System.out.println(changeCase(testChar2));
    }

    public static char changeCase(char c) {
        if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        } else {
            return c;
        }
    }
}
