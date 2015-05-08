/**
 * You are given two 32-bit numbers, N and M, and two bit positions, i and j.
 * Write a method to set all bits between i and j in N equal to M (e.g., M
 * becomes a substring of N located at i and starting at j). EXAMPLE: Input: N =
 * 100 0000 0000, M = 10101, i = 2, j = 6 Output: N = 10001010100
 * 
 * @author Chris
 * 
 */
public class Chapter5_1 {
	
	public static int updateBits(int n, int m , int i, int j) {
		int max = ~0;
		
		int left = max - ((1 << j) - 1);
		
		int right = ((1 << i) - 1);
		
		int mask = left | right;
		System.out.println("left = " + Integer.toBinaryString(left));
		System.out.println("right = " + Integer.toBinaryString(right));
		System.out.println("mask = " + Integer.toBinaryString(mask));
		
		System.out.println("(n & mask) = " + Integer.toBinaryString((n & mask)));
		System.out.println("(m << i) = " + Integer.toBinaryString((m << i)));
		
		return (n & mask) | (m << i);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 0x400;
		int M = 0x15;
		int i = 2;
		int j = 6;
		
		int result = updateBits(N, M , i ,j);
		System.out.println(Integer.toBinaryString(result));
	}

}
