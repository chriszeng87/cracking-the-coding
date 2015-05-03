

int findPathSum(int rightRemain, int downRemain, int[] markArray, int n) {
	if (rightRemain == 0 && downRemain == 0) {
		print(markArray)
		return 1;
	} else if (rightRemain < 0 || downRemain < 0) {
		return 0;
	}
	int rightSum = 0;
	if (rightRemain > 0) {
		markArray[n] = 0; //right
		rightSum = findPathSum(rightRemain-1, downRemain,markArray, n+1);
	}
	int downSum = 0;
	if (downRemain > 0) {
		markArray[n] = 1; //down;
		downSum = findPathSum(rightRemain, downRemain -1, markArray, n+1);
	}
	return rightSum + downSum;

}

findPathSum(N-1, N-1, markArray, 0)
