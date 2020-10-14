package chap06.lecture.staticKeyword;
//스태틱 
public class MyClass {
	static int var2;
	int var1;
	
	static {
		System.out.println("static block");
		var2 =3000;
	}
	
	void method1() //인스턴스 ->클래스 멤버 접근 가능
	{
		System.out.println(var2);
		System.out.println(var1);
	}
	

static	void method2()//클래스 ->인스턴스 멤버 접근x 

{	
//	method1();
	//System.out.println(var1);
	System.out.println(var2);
		
	}
	
	
}
