
public class A {
	public  String namee;
	public static int count;
	A(String name1){
		this.namee=name1;
		System.out.println(namee);
		count=count+2;
	}
	
	void hello() {
		System.out.println("Hello "+namee );
	}

}
