/**
 * You are given an array of integers (both positive and negative). Find the
 * continuous sequence with the largest sum. Return the sum. EXAMPLE Input: {2,
 * -8, 3, -2, 4, -10} Output: 5 (i.e., {3, -2, 4} )
 * 
 * @author Chris
 * 
 */
public class Chapter19_7 {
	
	public static int getLargestSum(int[] array) {
		if (array == null) {
			return 0;
		}
		int tempSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (tempSum < 0) {
				tempSum = 0;
			}
			tempSum = tempSum + array[i];
			if (tempSum > maxSum) {
				maxSum = tempSum;
			}
		}
		
		return maxSum;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = //{-3, -10, -5};
			{2,-8, 3, -2, 4, -10};
		System.out.println("------largest continous sum is " + getLargestSum(arr));
	}

}
