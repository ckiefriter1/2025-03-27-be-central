package strings;

public class StringBuilderExample {
	public static void main(String[] args) {
	
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";
		
		String fullName = firstName + " " + middleInitial + space + lastName;
		System.out.println("*** using String...");
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(fullName);
		
		StringBuilder sb = new StringBuilder();
		
		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println("\n*** using StringBuilder...");
		System.out.println(sb.toString());
		
		// Add a middle Initial, inserted into an existing string.
		sb.insert(firstName.length() + 1, middleInitial + space);
		System.out.println(sb.toString());
	}
}
