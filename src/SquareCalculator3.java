import java.util.Scanner;
public class SquareCalculator3 {
    public static void main(String[] args) {
        double width = 13.5;
        double height = 25.3;

        System.out.println(" The length of the width is : " + width);
        System.out.println(" The height is : " + height);

        double perimeter = 2 * (height + width);

        System.out.println("The perimeter of the rectangle is : " + perimeter);

        double area = width * height;

        System.out.println("The area of the rectangle is : " + area);

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle : "); // ask to enter the width

        double widthUser = myObj.nextDouble(); // reads user input
        System.out.println("Width of rectangle is : " + widthUser);

        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle : "); // ask to enter the height

        double heightUser = myObj1.nextDouble(); // reads user input
        System.out.println("Height of rectangle is : " + heightUser);

        double area1 = widthUser * heightUser;
        double perimeter1 = 2 * (widthUser + heightUser);

        System.out.println("The area of your rectangle is : " + area1);
        System.out.println("The perimeter of your rectangle is : " + perimeter1);

    }
}
