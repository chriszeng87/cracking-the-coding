/**
 * Given a matrix in which each row and each column is sorted, write a method to
 * find an element in it.
 * 
 * @author Chris
 * 
 */

public class SearchElemInSortedMatrix {

	public static boolean findElem(int[][] mat, int elem, int M, int N) {
		if (mat == null) {
			return false;
		}

		int row = M - 1;
		int col = 0;
		while (row >= 0 && col < N) {
			if (mat[row][col] == elem) {
				return true;
			} else if (mat[row][col] > elem) {
				row--;
			} else {
				col++;
			}
		}

		return false;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };

		for (int row = 0; row < test.length; row++) {
			for (int col = 0; col < test[0].length; col++) {
				int val = test[row][col];
				boolean founded = findElem(test, val, test.length,
						test[0].length);
				System.out.println("-----founded = " + founded);
			}
		}
	}

}
