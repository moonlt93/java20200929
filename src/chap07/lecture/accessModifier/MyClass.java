package chap07.lecture.accessModifier;

public class MyClass {
	//public, protected,(default/package private).private
	
	//public: 모두 사용 가능
	//protected: 다른 패키지에 있는 상속받은 클래스 
	//(default):패키지 내에서사용가능
	//private: 클래스 내에서 사용가능
	
	
	public int publicVar; //다 쓰는애
	protected int protectedVar; // 다른 패키지꺼 상속
	int defaultVar;// 패키지 내에서 
	

}
