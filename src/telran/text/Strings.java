package telran.text;

import static telran.text.RegularExpressions.*;

public class Strings {



	public static boolean isArithmeticExpression(String expression) {
		if (!checkParentheses(expression)) {
			return false;
		}
		expression = removeSpacesAndParentheses(expression);

		return expression.matches(arithmeticExpression());
	}

	
	private static boolean checkParentheses(String expression) {
		int countBrackets = 0;
		int expressionLength = expression.length();
		char[] charExpr = expression.toCharArray();
		for (int i = 0; i < expressionLength; i++) {
			if (charExpr[i] == '(') {
				countBrackets++;
			} else if (charExpr[i] == ')') {
				countBrackets--;
			
			if (countBrackets < 0) {
				return false;
			}
		}
	}
		return countBrackets == 0 ? true : false;
	}
	private static String removeSpacesAndParentheses(String expression) {

		return expression.replaceAll(" ", "");
}

}