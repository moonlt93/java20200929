package chap07.textbook.exercises.p06;

public class Child extends Parent {
	private String name;

	public Child() //2.���� argument�Լ��� ���� this ����. 
	{
//		super();
		this("ȫ�浿"); //child(string)�޼ҵ� ����.
		System.out.println("Child() call");
	}

	//
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name)call");
	
}

}
