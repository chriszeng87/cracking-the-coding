#include <stdio.h>

//Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method
//to rotate the image by 90 degrees. Can you do this in place?

#define N 4

/**
 * 假设是逆时针旋转
 */
void rotateMatrix(int matrix[][N]) {

	for (int i = 1; i < N; i++) {
		for (int j = 0; j < i; j++) {
			int tmp = matrix[i][j];
			matrix[i][j] = matrix[j][i];
			matrix[j][i] = tmp;
		}
	}

	for (int i = 0; i < N/2; i++) {
		for (int j = 0; j < N; j++) {
			int tmp = matrix[i][j];
			matrix[i][j] = matrix[N - i - 1][j];
			matrix[N - i - 1][j] = tmp;
		}
	}

}

int main () {
	int matrix[N][N] = { 0, 1,  2, 3,
						 4, 5,  6, 7,
						 8, 9, 10, 11,
						12, 13, 14, 15};
	rotateMatrix(matrix);
	return 0;
}
