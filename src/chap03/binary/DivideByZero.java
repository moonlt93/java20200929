package chap03.binary;

public class DivideByZero {

	public static void main(String[] args) {
		int x =5;
		int y =0;
		
//		int z = x / y; (not a number): nan
		System.out.println("� ���๮.........");
		
		double a =5.0;
		double b =0.0;
		
		double c = a / b; //infinity
		System.out.println(c);

		double d = a % b;
		System.out.println(d);
		
	}

}
