package chap07.textbook.exercises.p06;

public class Child extends Parent {
	private String name;

	public Child() //2.공백 argument함수에 전달 this 돌림. 
	{
//		super();
		this("홍길동"); //child(string)메소드 실행.
		System.out.println("Child() call");
	}

	//
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name)call");
	
}

}
