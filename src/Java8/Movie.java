package Java8;

public class Movie {
	private int year;
	private String name;
	private double rating;

	Movie(int year, String name, double rating) {
		this.year = year;
		this.name = name;
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

}
