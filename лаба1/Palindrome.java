public class Palindrome

{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " : " + Boolean.toString(Palindrome(s)));
        }
    }

    //  строка в обратном порядке
    public static String reverseString(String s) {
        String rds = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rds += s.charAt(i);
        }
        return rds;
    }

    // Проверка является ли палиндромом
    public static boolean Palindrome(String s) {
        String rds = "";
        for (int i = s.length()-1; i >= 0; i--) {
            rds += s.charAt(i);
        }
            return (rds.equals(reverseString(rds)));
        }
    }

