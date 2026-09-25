import java.util.Scanner;


public class NumberPrinter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


System.out.println("Please enter a number: ");
int number = input.nextInt();


for (int i = 1; i <= number; i++){
System.out.println(i);
input.close();
}}}