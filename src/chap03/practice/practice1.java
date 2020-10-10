package chap03.practice;

public class practice1 {

	public static void main(String[] args) {
		int x =5;
		double y=0.0;
		
		double z = x / y;
		double a = x % y;
		
		if(Double.isInfinite(z)) {
			z=0.0f;
		}
		if(Double.isNaN(a)) {
			a=0.0;
		}
		
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(Double.isInfinite(a));
		System.out.println(Double.isNaN(a));
		
		
		System.out.println(z+2);
		System.out.println(a+645465);

	}

}
