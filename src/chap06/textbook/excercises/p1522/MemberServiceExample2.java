package chap06.textbook.excercises.p1522;

import java.util.Scanner;

public class MemberServiceExample2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		MemberService2 memberService = new MemberService2();
		boolean run1 =true;
		while(run1) {
			System.out.println("id를 입력하세요.");
			String id =sc.nextLine();
			System.out.println("password를 입력하세요.");
			String password =sc.nextLine();
		
			boolean result =memberService.login(id, password);
			if(result) {
				System.out.println("로그인 되었습니다.");
				run1= false;
			}else {
				System.out.println("id 또는 password가 올바르지 않습니다. 다시 입력바랍니다.");
				
			}
		}
		boolean run2 =true;
		while(run2) {
			System.out.println("로그아웃하시려면 id를 입력하세요: ");
			String id =sc.nextLine();
			run2 = memberService.logout(id);
		}   
		
	}

}
