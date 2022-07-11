package telran.text;

public class RegularExpressions {

	public static String arithmeticExpression() {
		return String.format("\\(*(%1$s)\\)*([+*/-]\\(*(%1$s)\\)*)+", corrOperandRegex());
	}

	private static String corrOperandRegex() {
		return String.format("%1$s|\\d+|%2$s", javaVariableRegex(), doubleOrIntRegex());
	}

	public static String javaVariableRegex() {
		return "[a-zA-Z$][\\w$]*|_[\\w$]+";
	}

	private static String doubleOrIntRegex() {
		return "((\\d*)\\.(\\d+))";
	}

}