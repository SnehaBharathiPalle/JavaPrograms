package Java8;
public class EnumPractice {

	enum color {
		RED, BLUE, GREEN;
	}

	enum name {
		S("SNEHA", "PALLE"),
		SID("SREEDHAR", "REDDY");

		public final String firstName;
		public final String lastName;

		name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

	}

	public static void main(String[] args) {
		System.out.println(color.RED);
		for (name n : name.values()) {
			System.out.print(n.firstName +" ");
			System.out.print(n.lastName);
			System.out.println();
		}

	}
}
