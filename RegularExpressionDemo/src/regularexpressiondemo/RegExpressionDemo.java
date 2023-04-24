package regularexpressiondemo;

public class RegExpressionDemo {

	public static void main(String[] args) {
		// 1. Write a regular expression that matches only those sentences that start
//		 with the word “Good”?
		
		String start = "good morning";
		String startPattern = "^good.*\\b";

		if (start.matches(startPattern)) {
			System.out.println(start + " : Valid");
		} else {
			System.out.println(start + " : Invalid");
		}

		// 2. Write a regular expression that matches only those sentences that end with
		// the word “happy”?
		
		String end = "I am happy";
		String endPattern = "\\b.*happy$";

		if (end.matches(endPattern)) {
			System.out.println(end + " : Valid");
		} else {
			System.out.println(end + " : Invalid");
		}

		// 3. Write a regular expression that matches only those sentences that contain
		// the word “school”?
		
		String sentence = "I used to walk to school every day when I was a kid";
		String sentencePattern = "\\b.*school.*\\b";

		if (sentence.matches(sentencePattern)) {
			System.out.println(sentence + " : Valid");
		} else {
			System.out.println(sentence + " : Invalid");
		}

		// 4. Which of the following strings matches with the regular expression
		// “[^x-z]”?
		// (a) “Abc” (b) “xxx” (c) “xyz” (d) “yyy”
		// None. Only statisfies single character
		
		String match = "A";
		String matchPattern = "[^x-z]";

		if (match.matches(matchPattern)) {
			System.out.println(match + " : Valid");
		} else {
			System.out.println(match + " : Invalid");
		}

		// 5. Which of the following strings matches with the regular expression
		// “\\d\\W”?
		// (a) “#123” (b) “123” (c) “123#” (d) “abc#”
		// None. Only satisfies 2 characters start with digit and followed by non-word
		
		String numberMatch = "2#";
		String numberMatchPattern = "\\d\\W";

		if (numberMatch.matches(numberMatchPattern)) {
			System.out.println(numberMatch + " : Valid");
		} else {
			System.out.println(numberMatch + " : Invalid");
		}

		// 7. Write a regular expression to validate the password for the following
		// format:
		// a. Password with minimum length 5
		// b. Password having at least one capital letter
		// c. Password having at least one digit

		String password = "PassWord!1";
		String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9]).{5,}$";

		if (password.matches(passwordPattern)) {
			System.out.println(password + " : Valid");
		} else {
			System.out.println(password + " : Invalid");
		}

		// 8. Write a regular expression that matches only the following numbers:
		// 010, 111, 212, 313, 414, 515, 616, 717, 818, 919 [Hint: Capturing group]
		
		String numbers = "010";
		String numbersPattern = "^(\\d)\\d\\1$";

		if (numbers.matches(numbersPattern)) {
			System.out.println(numbers + " : Valid");
		} else {
			System.out.println(numbers + " : Invalid");
		}
		
	}

}
