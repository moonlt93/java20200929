package chap06.textbook.s060401;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();// 객체 생성(=클래스의 인스턴스 ) 클래스 변수 new 클래스 새로운 객체 생성.
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2변수가 또 다른 Student 객체를 참조합니다.");
	}

}
