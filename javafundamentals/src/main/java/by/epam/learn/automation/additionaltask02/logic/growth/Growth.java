package by.epam.learn.automation.additionaltask02.logic.growth;

/**
 * Class contains method for finding and displaying the specified sequence
 */
public class Growth {

    public static int[] growingSequence(int[][] matrix) {
        int[] sequence = new int[1];

        if (matrix != null && matrix.length > 1) {
            int numberOfGrowing = 1;
            int[] transientSequence = new int[matrix.length];
            for (int[] line : matrix) {
                for (int j = 0; j < line.length - 1; j++) {

                    //check for the either of neighboring elements
                    if (line[j] < line[j + 1]) {
                        transientSequence[numberOfGrowing - 1] = line[j];
                        transientSequence[numberOfGrowing] = line[j + 1];
                        numberOfGrowing++;
                    } else {
                        if (numberOfGrowing > 1
                                && sequence.length < numberOfGrowing) {
                            sequence = new int[numberOfGrowing];
                            System.arraycopy(transientSequence, 0, sequence, 0, numberOfGrowing);
                        }
                        numberOfGrowing = 1;
                    }

                    //check for the last element in line
                    if (j + 1 == matrix.length - 1) {
                        if (numberOfGrowing > 1 && sequence.length < numberOfGrowing) {
                            sequence = new int[numberOfGrowing];
                            System.arraycopy(transientSequence, 0, sequence, 0, numberOfGrowing);
                        }
                        numberOfGrowing = 1;
                    }
                }
            }
        }
        return sequence;
    }

}
