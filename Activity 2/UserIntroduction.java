import java.util.Scanner;

public class UserIntroduction {
    public static void main(String [] args){
      Scanner input = new  Scanner(System.in);

      String name;
      int age;
      String hobby;


      System.out.println("What is your name?");
      name = input.nextLine();

      System.out.println("How old are you? ");
      age = input.nextInt();

      input.nextLine();

      System.out.println("What is your hobby?");
      hobby = input.nextLine();
      
      System.out.println("Nice to meet you, " + name +"!");
      System.out.println("You are " + age + " years old and you love " + hobby +".");

    }
}
