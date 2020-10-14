package chap06.lecture.thisKeyword;

public class MyClass {
	
	int var;

	MyClass(){
		
	}
	
	
	MyClass(int var){
		this.var =var;//0
	}
	
	void method1() {
		int var =5;
		System.out.println(this.var);
		System.out.println(var);//5
		
	}

	void method2() {
		this.method1();//5
	

	}

}
