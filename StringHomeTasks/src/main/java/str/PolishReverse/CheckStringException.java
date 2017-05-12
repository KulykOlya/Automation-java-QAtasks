package str.PolishReverse;

public class CheckStringException {
	static void check(String text)throws RPNparserException{ 
		if (text.length() == 0)
			throw new RPNparserException("You don't write anything");
		for (int i = 0; i < text.length(); i++){
			if (Character.isLetter(text.charAt(i)) || Character.isSpaceChar(text.charAt(i)))  
			throw new RPNparserException("You've put wrong number or symbol: " + text.charAt(i)); }}
}