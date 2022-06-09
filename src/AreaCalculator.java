public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } return Math.PI * radius * radius;
    }

    public static double area(double sideOne, double sideTwo) {
        if (sideOne < 0 || sideTwo < 0) {
            return -1.0;
        } else {
            return sideOne * sideTwo;
        }
    }

}
