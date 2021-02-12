package by.epam.learn.automation.additionaltask02.logic.baseoperation;

import by.epam.learn.automation.additionaltask02.util.ConsolePrinter;

public class MatrixDisplayer {

    public static void display2DMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int[] submatrix = matrix[i];
            for (int j = 0; j < submatrix.length; j++) {
                ConsolePrinter.printText("\t " + submatrix[j]);
            }
            ConsolePrinter.printText(System.lineSeparator());
        }
    }

    public static void display1DMatrix(int[] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            ConsolePrinter.printText("\t " + matrix[i]);
        }
    }
}
