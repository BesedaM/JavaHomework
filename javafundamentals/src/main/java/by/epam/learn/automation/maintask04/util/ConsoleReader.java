package by.epam.learn.automation.maintask04.util;

import java.io.IOException;
import java.util.Scanner;


/**
 * Scans user's input
 */
public class ConsoleReader {

    public interface Constants{
        int ERROR_NUMBER_DEFAULT = 0;
    }

    private static Scanner scanner = new Scanner(System.in);

    public static String readText() throws IOException {
        return scanner.nextLine();
    }

    public static int readInt() {
        int number;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        }else{
            scanner.nextLine();
            number = Constants.ERROR_NUMBER_DEFAULT;
        }
        return number;
    }
}
