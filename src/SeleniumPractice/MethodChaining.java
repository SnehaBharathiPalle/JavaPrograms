package SeleniumPractice;

public class MethodChaining {

	public String name = "Sneha";
	public String color = "blue";
	public String city = "Boston";

	public MethodChaining() {

	}

	public MethodChaining setName(String name) {
		this.name = name;
		return this;

	}

	public MethodChaining setCity(String city) {
		this.city = city;
		return this;

	}

	public MethodChaining setColor(String color) {
		this.color = color;
		return this;

	}
	
	public void printAll() {
		System.out.println(name+" "+color+" "+city);
	}

}
