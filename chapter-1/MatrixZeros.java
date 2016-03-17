import java.util.*;

public class MatrixZeros {
  public static void main(String[] args){
    int[][] matrix = new int[][]{
      { 1, 1, 1, 1, 1, 1, 1},
      { 1, 1, 1, 1, 1, 1, 0},
      { 1, 1, 1, 0, 1, 1, 1},
      { 1, 1, 1, 1, 1, 1, 1},
      { 1, 1, 1, 1, 1, 1, 1}
    };

    zeroOutRowsAndColumns(matrix, 5, 7);

    System.out.println(matrix[0][0] == 1);
    System.out.println(matrix[0][1] == 1);
    System.out.println(matrix[0][2] == 1);
    System.out.println(matrix[0][3] == 0);
    System.out.println(matrix[0][4] == 1);
    System.out.println(matrix[0][5] == 1);
    System.out.println(matrix[0][6] == 0);

    System.out.println(matrix[1][0] == 0);
    System.out.println(matrix[1][1] == 0);
    System.out.println(matrix[1][2] == 0);
    System.out.println(matrix[1][3] == 0);
    System.out.println(matrix[1][4] == 0);
    System.out.println(matrix[1][5] == 0);
    System.out.println(matrix[1][6] == 0);

    System.out.println(matrix[2][0] == 0);
    System.out.println(matrix[2][1] == 0);
    System.out.println(matrix[2][2] == 0);
    System.out.println(matrix[2][3] == 0);
    System.out.println(matrix[2][4] == 0);
    System.out.println(matrix[2][5] == 0);
    System.out.println(matrix[2][6] == 0);

    System.out.println(matrix[3][0] == 1);
    System.out.println(matrix[3][1] == 1);
    System.out.println(matrix[3][2] == 1);
    System.out.println(matrix[3][3] == 0);
    System.out.println(matrix[3][4] == 1);
    System.out.println(matrix[3][5] == 1);
    System.out.println(matrix[3][6] == 0);
  }

  private static void zeroOutRowsAndColumns(int[][] matrix, int numberOfRows, int numberOfColumns){
    Set<Integer> rows = new HashSet<Integer>();
    Set<Integer> columns = new HashSet<Integer>();

    for (int x = 0; x < numberOfRows ; x++ ) {
      for (int y = 0; y < numberOfColumns ; y++ ) {
        if (matrix[x][y] == 0){
          rows.add(x);
          columns.add(y);
        }
      }
    }

    for(int row : rows) {
      for(int iterator = 0; iterator < matrix[row].length; iterator++){
        matrix[row][iterator] = 0;
      }
    }

    for(int column : columns) {
      for(int iterator = 0; iterator < matrix.length; iterator++){
        matrix[iterator][column] = 0;
      }
    }
  }
}


