package set2;

public class Q5 {
	
	public static void main(String[] args) {
		
	}




	public static int[][] multiplyMatrix(int[][] firstMatrix, int[][] secondMatrix) {
	
	  int rowsInFirstMatrix = firstMatrix.length;
	  int columnsInFirstMatrix = firstMatrix[0].length;
	  int columnsInSecondMatrix = secondMatrix[0].length;

	  int[][] result = new int[rowsInFirstMatrix][columnsInSecondMatrix];

	  for (int i = 0; i < rowsInFirstMatrix; i++) {
	    for (int j = 0; j < columnsInSecondMatrix; j++) {
	      for (int k = 0; k < columnsInFirstMatrix; k++) {
	        result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
	      }
	    }
	  }

	  return result;
	}
}
