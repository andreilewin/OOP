public class task2lewin {

    public static void main(String[] args) {
        System.out.println(Odin(3, 5));
        System.out.println(Dva("Donald Trump"));
        System.out.println(Tri(89, 20));
        System.out.println(cetyre(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(pytya(3, 4, 2));
        System.out.println(shesty("Hello World"));
        System.out.println(sem(147, 33, 526));
        System.out.println(vosem("ooxX"));
        System.out.println(devyt("There is a bomb."));
        System.out.println(ten("AA", "B@"));

    }
//четные и нечетные улицы,ищет номер дома на противоположной стороне улицы
    public static int Odin(int houseNumber, int houseCount) {
        return 2 * houseCount - houseNumber + 1;
    }
//меняет местами имя и фамилию
    public static String Dva(String firstAndSecondName) {
        String[] words = firstAndSecondName.split(" ");
        return words[1] + " " + words[0];
    }
//ищет цену после скидки
    public static float Tri(int price, int discount) {
        return (float) price * (100 - discount) / 100;
    }
//вычитаем из макса и мина 
    public static int cetyre(int[] array) {
        return arrayMax(array) - arrayMin(array);
    }
//Вывести кол-во одинаковых пар чисел
    public static int pytya(int a, int b, int c) {
        if (a == b && b == c)
            return 3;
        if (a == b || b == c || a == c)
            return  2;
        return 0;
    }
//переворот слов 
    public static String shesty(String s) {
        StringBuilder resultString = new StringBuilder();
        for (char c : s.toCharArray()) {
            resultString.insert(0, c);
        }
        return resultString.toString();
    }
//формирует массив и отправляет в 4 задание для вычисления 
    public static int sem(int firstSalary, int secondSalary, int thirdSalary) {
        return cetyre(new int[] {firstSalary, secondSalary, thirdSalary});
    }
// кол-во Х и О и проверка на равность
    public static boolean vosem(String s) {
        int xCount = 0;
        int oCount = 0;
        for (char c : s.toCharArray()) {
            xCount += Character.toLowerCase(c) == 'x' ? 1 : 0;
            oCount += Character.toLowerCase(c) == 'o' ? 1 : 0;
        }
        return xCount == oCount;
    }

    public static String devyt(String s) {
        return s.toLowerCase().contains("bomb") ? "DUCK!" : "Relax, there's no bomb.";
    }
// таблица ASCII 
    public static boolean ten(String s1, String s2) {
         int sumASCIIs1 = 0;
         int sumASCIIs2 = 0;
         for (char c : s1.toCharArray())
 sumASCIIs1 += c;
         for (char c : s2.toCharArray())
 sumASCIIs2 += c;
         return sumASCIIs1 == sumASCIIs2;
    }

    

    private static int arrayMax(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
 maxNumber = Math.max(maxNumber, j);
        }
        return maxNumber;
    }

    private static int arrayMin(int[] array) {
        int maxNumber = array[0];
        for (int j : array) {
 maxNumber = Math.min(maxNumber, j);
        }
        return maxNumber;
    }

}