public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(5,5));
    }


    public static Double area(double radius) {

        if (radius < 0) {
            System.out.println("İnvalid value");

        }

        double circle = radius * radius * Math.PI;

        return  circle;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0) || (x < 0 && y < 0)) {
            System.out.println("İnvalid value");

        }
        double sgrt = x * y;
        return sgrt;

    }


}
