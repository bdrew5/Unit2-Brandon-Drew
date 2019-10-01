
/**
 * Write a description of class Geometry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Geometry
{
    public static void main(String[] args) {
        int sides = 7;
        int radius = 5;
        final double PI = 3.14;
        int c;
        int a = 40;
        int b = 6;
        double y = 6.00;
        double z;

        z = (double) a/b;
        System.out.println("z= " +z);
        System.out.println("A heptagon " +sides + " sides.");
        System.out.println("A decagon has " +(sides+3) + " sides.");
        System.out.println("A dodecagon has " +(sides+radius) + " sides.");
        System.out.println("The circumference of a circle with a radius of " +radius+ " is " +(radius*PI*2));

    }
}
