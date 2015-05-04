/**
 * Write a method to replace all spaces in a string with ‘%20’.
 * 
 * @author Chris
 *
 */
public class Chapter1_5 {
	
	static void replace(char[] str, int len) {
		if(str == null || len == 0) {
			return;
		}
		
		int spaceNum = 0;
		for (int i = 0; i < len; i++) {
			if (str[i] == ' ') {
				spaceNum++;
			}
		}
		int newLength = len + 2 * spaceNum;
		str[newLength] = '\0';
		for (int i = len - 1; i >=0; i--) {
			if (str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength = newLength - 3;
			} else {
				str[newLength - 1] = str[i];
				newLength = newLength - 1;
			}
		}
			
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String testStr = "a b c d";
		char[] test = new char[100];
		for (int i = 0; i < testStr.length(); i++) {
			test[i] = testStr.charAt(i);
		}
		replace(test, 7);
		System.out.println("result = " + new String(test));
	}

}
