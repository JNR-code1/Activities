import java.util.Scanner;

public class LargestNumberFinder{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	System.out.print("Enter third number: ");
	int thirdNumber = input.nextInt();

//1st num	
    if (firstNumber > secondNumber && firstNumber > thirdNumber){
		System.out.println("The largest number is: " + firstNumber);

//1st num	
    } else if(firstNumber > secondNumber && firstNumber == thirdNumber){
		System.out.println("The largest number is: " + firstNumber);

//1st num
  	} else if(firstNumber > thirdNumber && firstNumber == secondNumber){
		System.out.println("The largest number is: " + firstNumber);

//2nd num	
    } else if (secondNumber > firstNumber && secondNumber > thirdNumber){
		System.out.println("The largest number is: " + secondNumber);
	
//2nd num
  	} else if (secondNumber > firstNumber && secondNumber == thirdNumber){
		System.out.println("The largest number is: " + secondNumber);

//2nd num	
    } else if (secondNumber > thirdNumber && firstNumber == secondNumber){
		System.out.println("The largest number is: " + secondNumber);

//3rd num	
    } else if (thirdNumber > firstNumber && thirdNumber > secondNumber){
		System.out.println("The largest number is: " + thirdNumber);

//3rd num	
    } else if (thirdNumber > firstNumber && thirdNumber == secondNumber){
		System.out.println("The largest number is: " + thirdNumber);

		} else {
		System.out.println("All numbers are equal.");
		}
  		input.close();
}
}


