package be.intecbrussel;

import java.util.Formatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Formatter myFormatter = new Formatter();
        String text = "I'm %d years old and %.2f m tall!";
        myFormatter.format(text, 21, 1.75);
        System.out.println(myFormatter.toString());
        myFormatter.close();

        Formatter otherFormatter = new Formatter();
        otherFormatter.format("%b %c %d %.1f %s %n", true, 'a', 12, 45.2, "hello");
        System.out.println(otherFormatter.toString());
        otherFormatter.close();

        Formatter indexFormatter = new Formatter();
        indexFormatter.format("%3$d %5$s %1$b %2$c %4$.1f %n", true, 'a', 12, 45.2, "hello");
        System.out.println(indexFormatter.toString());
        indexFormatter.close();

        Formatter flagsFormatter = new Formatter();
        flagsFormatter.format("%(d %+d %,d", -125, 145, 12356987);
        System.out.println(flagsFormatter.toString());
        flagsFormatter.close();

        Formatter widthAndPrecisionFormatter = new Formatter();
        widthAndPrecisionFormatter.format("%-6d %06d %.2f", -125, 145, 123.56987);
        System.out.println(widthAndPrecisionFormatter.toString());
        System.out.printf(widthAndPrecisionFormatter.toString());
        System.out.println();
        System.out.format(widthAndPrecisionFormatter.toString());
        widthAndPrecisionFormatter.close();
    }
}
