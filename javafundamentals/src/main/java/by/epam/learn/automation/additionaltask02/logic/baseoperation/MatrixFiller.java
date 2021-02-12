package by.epam.learn.automation.additionaltask02.logic.baseoperation;

import java.util.Random;

import static by.epam.learn.automation.additionaltask02.util.Text.MAX_VALUE;

public class MatrixFiller {

    public static void fillMatrix(int[][] matrix) {
        Random generator = new Random();
        for (int i = 0; i < matrix.length; i++) {
            int[] submatrix = matrix[i];
            for (int j = 0; j < submatrix.length; j++) {
                submatrix[j] = generator.nextInt(MAX_VALUE) * (generator.nextBoolean() ? 1 : -1);
            }

        }

    }
}
