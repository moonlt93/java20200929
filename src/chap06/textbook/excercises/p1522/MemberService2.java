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
		System.out.println("�α׾ƿ� �Ǿ����ϴ�. ���α׷��� �������ּ���.");
	return false;
	}else {
		System.out.println("���̵� �ٽ� ���ּ���.");
		return true;
	 }
	}
	

}
