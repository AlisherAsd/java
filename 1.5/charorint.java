public class charorint {
    public static void isDigit(char c) {
        boolean res = Character.isDigit(c);
        System.out.println("Is '" + c + "' a digit? " + res);
    }
    public static void main(String[] args) {
       
        isDigit('2');
    }

}
