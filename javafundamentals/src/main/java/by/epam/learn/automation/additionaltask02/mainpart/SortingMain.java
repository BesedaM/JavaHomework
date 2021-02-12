package by.epam.learn.automation.additionaltask02.mainpart;

import by.epam.learn.automation.additionaltask02.logic.baseoperation.MatrixDisplayer;
import by.epam.learn.automation.additionaltask02.logic.sorting.Sorting;
import by.epam.learn.automation.additionaltask02.util.ConsolePrinter;
import by.epam.learn.automation.additionaltask02.util.ConsoleReader;

import static by.epam.learn.automation.additionaltask02.util.Text.*;
import static by.epam.learn.automation.additionaltask02.util.Text.ERROR;

/**
 * SortingMain class was created just to make the code more readable.
 * Execute all the needed actions to implement the sorting with the given matrix
 */
public class SortingMain {

    public static void doFieldSorting(int[][] matrix) {

        ConsolePrinter.printText(SELECT_FIELD + System.lineSeparator());
        ConsolePrinter.printText(HINT.replace("*", matrix.length + ""));
        int field = ConsoleReader.readInt();
        if (field > 0 && field <= matrix.length) {
            Sorting.sortByField(matrix, field - 1);
            ConsolePrinter.printText(System.lineSeparator() + SORTED_MATRIX + System.lineSeparator());
            MatrixDisplayer.display2DMatrix(matrix);
        } else {
            ConsolePrinter.printText(ERROR);
        }

    }
}
