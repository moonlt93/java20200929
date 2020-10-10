package chap03.textbook;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y= 0.0;
		//5/0.0이네? Infinity니까 true, false , infinity
		double z=x/y;
		//double z =x%y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		System.out.println(z+2);

	}

}
