#include <stdio.h>
#include <stdlib.h>

//Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column
//is set to 0.

#define N 5

void setZero(int matrix[][N], int m) {
	int* row = (int *)malloc(m * sizeof(int));
	for (int i = 0; i < m; i++) {
		*(row + i) = 1;
	}

	int* column = (int *)malloc(N * sizeof(int));
	for (int i = 0; i < N; i++) {
		*(column + i) = 1;
	}

	for (int i = 0; i < m; i++) {
		for (int j = 0; j < N; j++) {
			if (matrix[i][j] == 0) {
				row[i] = 0;
				column[j] = 0;
			}
		}
	}

	for (int i = 0; i < m; i++) {
		for (int j = 0; j < N; j++) {
			if (row[i] == 0 || column[j] == 0)
				matrix[i][j] = 0;
			printf("%d  ", matrix[i][j]);
		}
		printf("\n");
	}



}

int main () {
	int matrix[4][5] = { 1, 1,  2, 3, 0,
						 0, 5,  6, 0, 1,
						 8, 9, 10, 11, 1,
						12, 13, 14, 15, 1};
	setZero(matrix, 4);
	return 0;
}
