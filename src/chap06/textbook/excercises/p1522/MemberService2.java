package chap06.textbook.excercises.p1522;

public class MemberService2 {
	
	String id2;
	String password2;
	
	
	boolean login (String id2, String password2) {
		if(id2.contentEquals("hong")&& password2.equals("12345")) {
			return true;
		}
	return false;
	
	
	}
boolean logout(String id2) {
	if(id2.equals("hong")) {
		System.out.println("로그아웃 되었습니다. 프로그램을 종료해주세요.");
	return false;
	}else {
		System.out.println("아이디 다시 써주세요.");
		return true;
	 }
	}
	

}
