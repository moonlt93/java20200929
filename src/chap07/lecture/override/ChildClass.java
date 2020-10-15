package chap07.lecture.override;

public class ChildClass extends ParentClass{
	void method2() {
		System.out.println("child method");
		
	}
	
	@Override 
	void method1() //내용 바꾸고 싶을때 @Override -> 어노테이션 
	{
		System.out.println("child method1!!!!!!!!!!!!");
	}
}
