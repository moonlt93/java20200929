
package chap06.textbook.excercises.p14;

public class Member {
	String name="�̸�";
	String id ="���̵�";
	String password ="�н�����";
	int age;
	
	Member user1 =new Member("ȫ�浿","hong");
	Member user2 = new Member("���ڹ�","java");

Member(String name){
	this.name=name;
}
Member(String name,String id){
	this.name=name;
	this.id=id;
	}
}