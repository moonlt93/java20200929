package chap06.lecture.staticKeyword;
//����ƽ 
public class MyClass {
	static int var2;
	int var1;
	
	static {
		System.out.println("static block");
		var2 =3000;
	}
	
	void method1() //�ν��Ͻ� ->Ŭ���� ��� ���� ����
	{
		System.out.println(var2);
		System.out.println(var1);
	}
	

static	void method2()//Ŭ���� ->�ν��Ͻ� ��� ����x 

{	
//	method1();
	//System.out.println(var1);
	System.out.println(var2);
		
	}
	
	
}
