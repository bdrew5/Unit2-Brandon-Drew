// I would like 100%
// 1) It would be a compile time error, because the quatation mark is missing
// 3) n*w+r= error because you would get a double anwser when it has to be a int
// 4) The toLowerCase method has no parameters, and it returns the string all in lower case letters

import java.util.Scanner;
import java.util.Random;
public class Quiz {
  public static void main(String[] args) {
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";

    String letter1 = firstName.substring(0,1);
    String letter2 = middleName.substring(0,1);
    String letter3 = lastName.substring(0,1);
    String letters = ((letter1) + (letter2) + (letter3));
    String fml = letters.toLowerCase();
    System.out.println(fml);

// second code
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int num1 = rand.nextInt((100) + 1);
    System.out.println("Pick a number between 1 and 100");
    int num2 = scan.nextInt();
    int num3 = ((num2) - (num1));
    int num4 = Math.abs(num3);
    System.out.println("Your lucky number is " + num4);

  }
}
