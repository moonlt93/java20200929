package chap07.textbook.exercises.p06;

public class Parent {
	public String nation;
	
	
	public Parent() {
		this("���ѹα�");//parent(string) �޼ҵ� ����  
		System.out.println("parent() call");
	}
	 
	public Parent(String nation) {
		this.nation =nation;
		System.out.println("Parent(String nation) call");
	}

}
