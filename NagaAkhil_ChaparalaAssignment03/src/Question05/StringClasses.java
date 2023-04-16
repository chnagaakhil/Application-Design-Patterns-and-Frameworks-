package Question05;

public class StringClasses {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Welcome");
		StringBuilder sbuilder = new StringBuilder("String Classes");

		// StringBuffer methods
		sb.append(" Hello");
		System.out.println(sb);
		sb.insert(0, "Hi, ");
		System.out.println(sb);
		sb.replace(0, 3, "Hey");
		System.out.println(sb);

		// StringBuilder methods
		sbuilder.append(" String Concat");
		System.out.println(sbuilder);
		sbuilder.insert(0, "String Append, ");
		System.out.println(sbuilder);
		sbuilder.replace(0, 3, "String Replac");
		System.out.println(sbuilder);
	}
}

