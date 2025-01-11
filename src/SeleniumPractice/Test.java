package SeleniumPractice;

import Java8.CustomException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Singleton x=Singleton.getInstance();
//		Singleton y=Singleton.getInstance();
//		System.out.println(x.toString());
//		System.out.println(y.toString());
		MethodChaining m=new MethodChaining();
		m.setCity("ATP").setName("Tasha").setColor("Pink").printAll();
//		System.out.println(m.city);
//		System.out.println(m.name);
//		System.out.println(m.color);
//		
 * 
 */
		try {
			throw new CustomException("SNEHA");
		}catch(CustomException ce) {
			throw new RuntimeException();
			//System.out.println(ce.getMessage());
		}

	}

}
