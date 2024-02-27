public class FunWith2DArrays {
    public static double average(int[][] array) {
        double sum = 0.0;
        for (int[] list : array) {
            for (int n : list) {
                sum += n;
            }
        }
        double average = sum / (array.length * array[0].length);
        return average;
    }
    public static int edgeSum(int[][] array) {
        int edgeSum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || i == array.length - 1) {
                for (int j = 0; j < array[0].length; j++) {
                    edgeSum += array[i][j];
                }
            } else {
                edgeSum += array[i][0];
                edgeSum += array[i][array[0].length - 1];
            }
        }
        return edgeSum;
    }
    public static int[] indexFound(String[][] array, String target) {
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j][i].equals(target)) {
                    int[] index = {j, i};
                    return index;
                }
            }
        }
        int[] index = {-1, -1};
        return index;
    }

    public static int[][] split(int[][] array, int row, int col) {
        if (row > array.length || col > array[0].length) {
            int[][] newArray = new int[0][0];
            return newArray;
        }
        int[][] newArray = new int[row + 1][col + 1];
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[0].length; j++) {
                newArray[i][j] = array[i][j];
            }
        }
        return newArray;
    }

    public static int[][] invert(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
               newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }
}
