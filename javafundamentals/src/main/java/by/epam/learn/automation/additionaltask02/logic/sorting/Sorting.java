package by.epam.learn.automation.additionaltask02.logic.sorting;

/**
 * Sorts matrix elements in some order
 */
public class Sorting {

    /**
     * Sorts elements in order of @field elements growth
     *
     * @param matrix Input 2-dimensional matrix matrix
     * @param field  Number of field to sort by
     */
    public static void sortByField(int[][] matrix, int field) {

        if (matrix != null && field >= 0
                && matrix.length > field && matrix[0].length > 1) {

            //simple bubble sort algorithm for a matrix field
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length - i - 1; j++)


                    if (matrix[j][field] > matrix[j + 1][field]) {
                        //swap elements in lines
                        for (int k = 0; k < matrix.length; k++) {
                            int transientElem = matrix[j + 1][k];
                            matrix[j + 1][k] = matrix[j][k];
                            matrix[j][k] = transientElem;
                        }

                    }


            }
        }

    }

}
