package by.epam.learn.automation.additionaltask02.mainpart;

import by.epam.learn.automation.additionaltask02.logic.baseoperation.MatrixDisplayer;
import by.epam.learn.automation.additionaltask02.logic.growth.Growth;
import by.epam.learn.automation.additionaltask02.util.ConsolePrinter;

import static by.epam.learn.automation.additionaltask02.util.Text.LONGEST_GROWING_SEQUENCE;

public class GrowthMain {

    public static void displayGrowingSequence(int[][] matrix) {
        int[] growingSequence = Growth.growingSequence(matrix);
        ConsolePrinter.printText(LONGEST_GROWING_SEQUENCE + System.lineSeparator());
        MatrixDisplayer.display1DMatrix(growingSequence);
    }
}
