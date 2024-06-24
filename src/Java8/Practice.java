package Java8;

public class Practice {

	private static Practice instance;

	// Singleton class
	private Practice() {

	}

	public static Practice getInstance() {
		if (instance == null) {
			instance = new Practice();

		}
		return instance;

	}

}
