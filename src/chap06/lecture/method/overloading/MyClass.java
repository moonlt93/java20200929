package chap06.lecture.method.overloading;
//메소드 만들때 파라미터 타입이 둘중 하나 꼭 달라야함.
public class MyClass {
	void method1(){
		System.out.println("method1......");
	}
	
	void method1(int i) {
		System.out.println("method1##########");
	}
	
	void method1(double j) {
		System.out.println("method1***************");
	}

	
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	void method(int i ,double j) {
		System.out.println("method int,double");
	}
	void methood1(double i, int j) {
		{
			System.out.println("method1 double,int");
		}
		
//		int method1(double i , int j) {
//			System.out.println("method1 double, int  ,return int");
//			return 3;
//		
		}
		
	}

