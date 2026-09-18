import java.util.Scanner;

public class DescendingPrinter{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

for (int i = number; i >= 1; i--){
System.out.println(i);
}
System.out.println("Loop complete!");

}}