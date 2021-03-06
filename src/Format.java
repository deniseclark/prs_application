// ****************************************************************************
// ***                                                                      ***
// *** Class Name:  Format                                                  ***
// ***                                                                      ***
// *** Description: The Format Class is a Class that is Used to Format      ***
// ***              Data.  Current Methods Available:                       ***
// ***                                                                      ***
// ***              1.)  fmtPhoneNumber  ==> "(999) 999-9999")              ***
// ***              2.)  fmtToLowerCase                                     ***
// ***              3.)  fmtToUpperCase                                     ***
// ***              4.)  fmtToTitleCase                                     ***
// ***              5.)  fmtToCamelCase                                     ***
// ***                                                                      ***
// ****************************************************************************
public class Format {

	// **********************************************************
	// *** Format a 10 Digit Phone Number to "(999) 999-9999" ***
	// *** <Borrowed from Stack Overflow> ***
	// **********************************************************
	public static String fmtPhoneNumber(Long phoneNum) {
		StringBuilder sb = new StringBuilder(15);
		StringBuilder temp = new StringBuilder(phoneNum.toString());
		while (temp.length() < 10)
			temp.insert(0, "0");
		char[] chars = temp.toString().toCharArray();
		sb.append("(");
		for (int i = 0; i < chars.length; i++) {
			if (i == 3)
				sb.append(") ");
			else if (i == 6)
				sb.append("-");
			sb.append(chars[i]);
		}
		return sb.toString();
	}

	// **********************************************
	// *** Format the Input String to Lower Case ***
	// **********************************************
	public static String fmtToLowerCase(String input) {
		return input.toLowerCase();
	}

	// **********************************************
	// *** Format the Input String to Upper Case ***
	// **********************************************
	public static String fmtToUpperCase(String input) {
		return input.toUpperCase();
	}

	// *********************************************
	// *** Format the Input String to Title Case ***
	// *********************************************
	public static String fmtToTitleCase(String input) {
		StringBuilder titleCase = new StringBuilder();
		boolean nextTitleCase = true;
		for (char c : input.toCharArray()) {
			if (Character.isSpaceChar(c)) {
				nextTitleCase = true;
			} else if (nextTitleCase) {
				c = Character.toTitleCase(c);
				nextTitleCase = false;
			}
			titleCase.append(c);
		}
		return titleCase.toString();
	}
	
	// *********************************************
	// *** Format the Input String to Camel Case ***
	// *********************************************
	   public static String fmtToCamelCase(String inputString) {
	       String result = "";
	       if (inputString.length() == 0) {
	           return result;
	       }
	       char firstChar = inputString.charAt(0);
	       char firstCharToUpperCase = Character.toUpperCase(firstChar);
	       result = result + firstCharToUpperCase;
	       for (int i = 1; i < inputString.length(); i++) {
	           char currentChar = inputString.charAt(i);
	           char previousChar = inputString.charAt(i - 1);
	           if (previousChar == ' ') {
	               char currentCharToUpperCase = Character.toUpperCase(currentChar);
	               result = result + currentCharToUpperCase;
	           } else {
	               char currentCharToLowerCase = Character.toLowerCase(currentChar);
	               result = result + currentCharToLowerCase;
	           }
	       }
	       return result;
	   }


}
