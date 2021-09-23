import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {

    public static final int MAX_ITERATIONS = 2000;
//метод изменяет поля прямоугольника,для нахождения наиболее интересной области
    @Override
    public void getInitialRange(Rectangle2D.Double range) {
        range.x = -2;
        range.y = -1.5;
        range.height = 3;
        range.width = 3;
    }
//устанавливает ограничение итераций и реализует комплексные числа
    @Override
    public int numIterations(double x, double y) {
        double r = x;
        double i = y;
        int counter = 0;
        while (counter < MAX_ITERATIONS) {
            counter++;
			//формуы для упращения вычислений
            double k = r * r - i*i+x;
            double m = 2 * r * i + y;
            r = k;
            i = m;
            if (r*r+i*i > 4)
                break;
        }
        if (counter == MAX_ITERATIONS)
			//вернем -1 что-бы показать что точки вышли за границы
            return -1;
        return counter;
    }
}
