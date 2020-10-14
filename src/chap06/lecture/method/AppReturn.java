package chap06.lecture.method;

public class AppReturn {
	public static void main(String[] args) {
		MyClassreturn o1 = new MyClassreturn();
		o1.method1();
		o1.var1 = 5;

		int v = o1.method2();

		System.out.println(v);

	}

}
