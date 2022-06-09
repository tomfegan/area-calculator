import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(3));
        System.out.println(AreaCalculator.area(-4));

        System.out.println(AreaCalculator.area(2,4));
        System.out.println(AreaCalculator.area(-2,4));
        System.out.println(AreaCalculator.area(2,-4));

    }
}
