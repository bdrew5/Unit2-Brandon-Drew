import java.util.Scanner;
import java.util.Random;

public class Store{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("How many books are you purchasing?");
    int books = input.nextInt();
    System.out.println("How many movies are you purchasing?");
    int movies = input.nextInt();
    System.out.println("How many pounds of Peanuts are you purchasing?");
    double peanuts = input.nextDouble();
    System.out.println("What is the cashier's name?");
    String name = input.next();

    int booksPrice = books * 9;
    double moviePrice = movies * 13.97;
    double moviePrices = Math.round(moviePrice * 100.0)/100.0;
    double peanutsPrice = peanuts * 1.72;
    double pPrice= Math.round(peanutsPrice * 100.0)/100.0;

    double movieShipping = moviePrice * .04;
    double bookShipping = books * .95;
    double peanutsShipping = peanuts * .3;

    double Shipping = movieShipping + bookShipping +peanutsShipping;
    double shippingTtl = Math.round(Shipping * 100.0)/100.0;

    double totalBeforeTax = booksPrice + moviePrice + peanutsPrice;
    double subTtl = Math.round(totalBeforeTax * 100.0)/100.0;


    double tax = 0.072 * totalBeforeTax;
    double realTax = Math.round(tax * 100.0)/100.0;


    double total = tax + totalBeforeTax;
    double Ttl = Math.round(total * 100.0)/100.0;
    double ttl = Ttl + 0.00;


    int hour = (rand.nextInt(24) + 1);
    int min = rand.nextInt(60);

    int month = (rand.nextInt(11) + 1);
    int day = (rand.nextInt(27) + 1);

    System.out.println("---------------------------------------");
    System.out.println("           STEVE'S S-MART              ");
    System.out.println("           2076 EAST MALL              ");
    System.out.println("---------------------------------------");
    System.out.println("Date:" + month + "/" + day + "/2019" + "           Time:" +hour + ":" +min);
    System.out.println("Cashier Name: " + name);
    System.out.println("---------------------------------------");
    System.out.println("Peanut Price: " + pPrice );
    System.out.println("Movie Price: " + moviePrices);
    System.out.println("Book Price: " + booksPrice);
    System.out.println(" ");
    System.out.println("Total Before Tax: " + subTtl);
    System.out.println(" ");
    System.out.println("Shipping Costs: " + shippingTtl);
    System.out.println(" ");
    System.out.println("Total Sales Tax: " +realTax);
    System.out.println(" ");
    System.out.println("Total: " + ttl);
  }

}
