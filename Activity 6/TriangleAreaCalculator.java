import java.util.Scanner;

public class TriangleAreaCalculator{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the Base: ");
    int base = input.nextInt();

    System.out.println("Please enter the Height: ");
    int height = input.nextInt();

    double area = (0.5 * (base * height));

    System.out.println("The area of the triangle is: " + area);

}
}
