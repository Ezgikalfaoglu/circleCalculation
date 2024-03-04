import java.util.Scanner;

public class circleCalculation {
    public static void main(String[] args) {
        double pi = 3.14;
        double r;
        double areaOfCircle;
        double circumferenceOfTheCircle;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a radius value:");
        r = scanner.nextDouble();
        areaOfCircle = pi * r * r;
        System.out.println("Area of the circle is: " + areaOfCircle);
        circumferenceOfTheCircle = 2 * pi * r;
        System.out.println("Circumference of the circle is: " + circumferenceOfTheCircle);
    }
}