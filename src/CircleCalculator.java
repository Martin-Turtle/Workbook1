public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleDiameter = 2 * circleRadius;
        double circleCircumferance = 3.14 * circleDiameter;
        double circleArea = 3.14 * circleRadius * circleRadius;

        System.out.println("The Radius of the circle is : " + circleRadius);
        System.out.println("The Diameter of the circle is : " + circleDiameter);
        System.out.println("The Circumference of the circle is : " + circleCircumferance);
        System.out.println("THe Area of the circle is : " + circleArea);
    }
}
