import java.util.Scanner;


public class Average
{
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    double x1 = in.nextInt();
    double y1 = in.nextInt();
    double x2 = in.nextInt();
    double y2 = in.nextInt();

    System.out.println("The points are (" + x1+ "," + y1+ "), (" + x2+ "," + y2+ ")");

    double dist1 = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);

    double dist2 = sqrt(dist1);

    System.out.println("The distance between the two points is " + dist2);
      }
}
© 2019 GitHub, Inc.
