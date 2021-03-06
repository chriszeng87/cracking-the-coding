/**
 * Chapter1_3
 *   Design an algorithm and write code to remove the duplicate characters in a
 * string without using any additional buffer. NOTE: One or two additional
 * variables are fine. An extra copy of the array is not. 
 * 
 * FOLLOW UP Write the test cases for this method.
 * 
 * @author Chris
 * 
 */
public class RemoveDupCharInString {

	static void removeDupChar(char[] str) {
		if (str == null || str.length <= 1) {
			return;
		}

		int len = str.length;
		int tail = 1;
		for (int i = 1; i < len; i++) {
			int j;
			for (j = 0; j < tail; j++) {
				if (str[i] == str[j]) {
					break;
				}
			}
			if (j == tail) {
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail] = 0;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] test = "abab".toCharArray();
		removeDupChar(test);
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < test.length; i++) {
			if (test[i] != 0) {
				str = str.append(test[i]);
			} else {
				break;
			}
		}
		System.out.println("result = " + str);
	}

}
