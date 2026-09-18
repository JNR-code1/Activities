import java.util.Scanner;

public class FahrenheitToCelsius{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("Please enter temperature in Fahrenheit:");
	double Fahrenheit =input.nextDouble();

	double Celsius =(Fahrenheit-32)* 5 / 9;
	System.out.printf("Temperature in Celsius:  %.2f °C %n",Celsius);
	input.close();

}
}