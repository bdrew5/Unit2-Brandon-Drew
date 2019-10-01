import java.util.Random;

public class PhoneNumber{
  public static void main(String[] args){
    Random rand = new Random();

    rand.nextInt(10);
    System.out.print("A random phone number is (" + rand.nextInt((8) + 2));
    System.out.print(rand.nextInt(9));
    System.out.print(rand.nextInt(10));
    System.out.print(")" + rand.nextInt((8)+1));
    System.out.print(rand.nextInt(10));
    System.out.print(rand.nextInt(10));
    System.out.print("-" + rand.nextInt(10));
    System.out.print(rand.nextInt(10));
    System.out.print(rand.nextInt(10));
    System.out.print(rand.nextInt(10));
  }
}
