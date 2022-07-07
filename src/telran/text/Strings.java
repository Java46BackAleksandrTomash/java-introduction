package telran.text;
import java.util.regex.*;

public class Strings {	

		public static boolean hasaValidBrackets(String text) {
		    String pattern = "\\w+\\(\\w+\\[\\w+\\(\\w+\\)\\w+\\]\\w+\\{\\{\\[\\w+\\]\\}\\}\\w+\\)";
		return text.matches(pattern);
	}
	
	
}
