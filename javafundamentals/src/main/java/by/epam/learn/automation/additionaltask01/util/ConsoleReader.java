package by.epam.learn.automation.additionaltask01.util;

import java.io.IOException;
import java.util.Scanner;


/**
 * Scans user's input
 */
public class ConsoleReader {

    private static Scanner scanner = new Scanner(System.in);

    public static String readText() throws IOException {
        return scanner.nextLine();
    }

}
