package chap06.textbook.excercises.p14;

public class Members {

	public static void main(String[] args) {
	String name;
	String id;
	int age;
	String password;
	
	Member user1 = new Member("ȫ�浿", "hong");
	Member user2 = new Member("���ڹ�", "java");

	System.out.println(user1.name);
	System.out.println(user1.id);

	System.out.println(user2.name);
	System.out.println(user2.id);

	}
}
