import java.util.Arrays;

public class task3{

    public static void main(String[] args) {
        String[][] resArray1 = millionsRounding(new String[][] {{"Nice", "942208"},
                                                               {"Abu Dhabi", "1482816"},
                                                               {"Naples", "2186853"},
                                                               {"Vatican City", "572"}});
        for (String[] strArray : resArray1) {
            System.out.println(Arrays.toString(strArray));
        }

        float[] resArray2 = otherSides(2);
        System.out.println(resArray2[0]);
        System.out.println(resArray2[1]);

        System.out.println(rps("rock", "paper"));
        System.out.println(warOfNumbers(new int[] {5, 9, 45, 6, 2, 7, 34, 8, 6, 90, 5, 243}));
        System.out.println(reverseCase("sPoNtAnEoUs"));
        System.out.println(inatorInator("EvilClone"));
       System.out.println(doesBrickFit(1, 2, 1, 1, 1));
        System.out.println(totalDistance(36.1f, 8.6f,3, true));
        System.out.println(mean(new int[] {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3}));
        System.out.println(parityAnalysis(243));
    }
    public static String[][] millionsRounding(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            int population = Integer.parseInt(array[i][1]);
            array[i][1] = String.valueOf(1000000 * Math.round(population / 1000000f));
        }
        return array;
    }

    public static float[] otherSides(float shortSide) {
        return new float[] {Math.round(shortSide*200) / 100f, Math.round(shortSide * 173.2f) / 100f};
    }

    public static String rps(String first, String second) {
        if (first.equals(second))
            return "TIE";
        if ((first.equals("rock") && second.equals("scissors")) ||
            (first.equals("scissors") && second.equals("paper")) ||
            (first.equals("paper") && second.equals("rock")))
            return "Player 1 wins";
        if ((first.equals("scissors") && second.equals("rock")) ||
            (first.equals("paper") && second.equals("scissors")) ||
            (first.equals("rock") && second.equals("paper")))
            return "Player 2 wins";
        return "incorrect input";
    }

    public static int warOfNumbers(int[] numbers) {
        int even_sum = 0;
        int odd_sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0)
                even_sum += number;
            else
                odd_sum += number;
        }
        return even_sum > odd_sum ? even_sum - odd_sum : odd_sum - even_sum;
    }

    public static String reverseCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 65 && c <= 90)
                sb.append((char) (c + 32));
            else
                sb.append((char) (c - 32));
        }
        return sb.toString();
    }

    public static String inatorInator(String str) {
        int len = str.length();
        StringBuilder sb = new StringBuilder(str);
        if ("aeiouy".contains(String.valueOf(str.toLowerCase().charAt(len - 1))))
            sb.append("-inator ").append(len).append("000");
        else
            sb.append("inator ").append(len).append("000");
        return sb.toString();
    }

  public static boolean doesBrickFit(int a, int b, int c, int w, int h) 
{
return doesBrickSideFit(a,b, w, h) || doesBrickSideFit(a,c, w, h) || doesBrickSideFit(c,b, w, h);
}


    private static boolean doesBrickSideFit(int side1,int side2, int w, int h) {
        return (side1 <= w && side2 <= h) || (side1 <= w && side2 <= h);
    }

    public static float totalDistance(float fuel, float basicConsumption, int passengers, boolean conditioner) {
        float consumption = basicConsumption;
        consumption += passengers * basicConsumption * 0.05f;
        consumption += conditioner ? consumption * 0.1f : 0;
        return Math.round(10000 * fuel / consumption) / 100f;
    }

    public static float mean(int[] array) {
        int sum = 0;
        for (int number : array)
            sum += number;
        return Math.round(100f * sum / array.length) /100f;
    }

    public static boolean parityAnalysis(int number){
        int s = 0;
        boolean isNumberEven = number % 2 == 0;
        while (number > 0) {
            s += number % 10;
            number /= 10;
        }
        return isNumberEven == (s % 2 == 0);
    }
}