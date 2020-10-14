
package chap06.textbook.excercises.p14;

public class Member {
	String name="이름";
	String id ="아이디";
	String password ="패스워드";
	int age;
	
	Member user1 =new Member("홍길동","hong");
	Member user2 = new Member("김자바","java");

Member(String name){
	this.name=name;
}
Member(String name,String id){
	this.name=name;
	this.id=id;
	}
}