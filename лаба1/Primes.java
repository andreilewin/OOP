public class Primes
{
    public static void main(String[] args) {
        for (int i = 2; i < 101; i++) {
            if (Prime(i)) {
                System.out.println(i);
            }
        }
    }

    // Проверка на то что число является простым
    public static boolean Prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
