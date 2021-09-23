public class Lab1
{
    public static void main(String[] args) {
        Point3d p1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
        Point3d p2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
        Point3d p3 = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));

        System.out.println("Plochad treygolnika: " + computeArea(p1, p2, p3));
    }

    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        // Если одна из точек равна другой то площадь не вычисляется
        if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
            return -1;
        } else {
            double a = p1.distanceTo(p2);
            double b = p2.distanceTo(p3);
            double c = p3.distanceTo(p1);
            double t = (a+b+c)/2;
            return (Math.sqrt(t*(t-a)*(t-b)*(t-c)));
        }
    }
}
