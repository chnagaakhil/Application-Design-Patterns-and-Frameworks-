package Question06;

public class StringMethods {

	public static void main(String[] args) {
		// StringBuffer Example
		StringBuffer sb = new StringBuffer("Let's");
		sb.append(" Start");
		System.out.println(sb); // Output: Let's Start

		// String Example
		String str1 = "Learning ";
		String str2 = "JAVA Programming";
		String str3 = str1.concat(str2);
		System.out.println(str3); // Learning JAVA Programming
	}
}
