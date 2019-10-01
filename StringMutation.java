import java.util.*;


/**
 * Play with Strings
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringMutation
{
    public static void main(String[] args)
    {
        String phrase= new String("Change is inevitable");
        System.out.println(phrase);
        int phraseLength = phrase.length();
        System.out.println("lenght of phrase = " + phraseLength);
       String mut1, mut2, mut3, mut4;

       mut1 = phrase + ", except from vending machines.";
       System.out.println(mut1);
       System.out.println("length of mut1 = " + mut1.length());

       mut2 = mut1 + String; toUpperCase();

       System.out.println(mut2);
       System.out.println("length of mut2 = " + mut2.length());

       mut3 = mut2 + String; replace(e, x);

       System.out.println(mut3);
       System.out.println("length of mut3 = " + mut3.length());

       mut4 = mut3 + String; substring(int nge; int rom;);

       System.out.println(mut4);
       System.out.println("length of mut4 = " + mut4.length());
         }
}
