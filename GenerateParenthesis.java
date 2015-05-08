import java.util.ArrayList;
import java.util.List;

/**
 * Given n pairs of parentheses, write a function to generate all combinations
 * of well-formed parentheses.
 * 
 * For example, given n = 3, a solution set is:
 * 
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 * 
 * @author Chris
 * 
 */

public class GenerateParenthesis {

	public static void generateParenthesis(List<String> lists, int left,
			int right, int n, String str) {
		if (left < right) {
			return;
		}

		if (left == n && right == n) {
			lists.add(str);
			return;
		}

		if (left < n) {
			generateParenthesis(lists, left + 1, right, n, str + "(");
			generateParenthesis(lists, left, right + 1, n, str + ")");
		} else {
			generateParenthesis(lists, left, right + 1, n, str + ")");
		}
	}

	public static List<String> generateParenthesis(int n) {
		List<String> lists = new ArrayList<String>();
		if (n <= 0) {
			return lists;
		}

		int left = 0;
		int right = 0;
		String str = new String();
		generateParenthesis(lists, left, right, n, str);
		return lists;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("    " + generateParenthesis(3));

	}

}
