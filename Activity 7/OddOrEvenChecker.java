import java.util.Scanner;

public class OddOrEvenChecker {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

	System.out.println("Please enter a number:");
	int number = input.nextInt();

	if (number %2==0) {

	System.out.println(number + " is even.");
  }else {
	System.out.println(number + " is odd");
  }

  System.out.println("Thank you for using the Odd or Even Checker!");
  input.close();
}
}