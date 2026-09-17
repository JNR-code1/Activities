import java.util.Scanner;
public class CircleAreaCalculator{
public static void main(String[] args){
  Scanner input = new Scanner(System.in);

  System.out.println("Enter the radius of the circle:");
  int radius = input.nextInt();

  double area = (Math.PI * (radius * radius));

  System.out.printf("The area of the circle is: %.2f%n", area);
  input.close();

  }
}
