package chap06.textbook.excercises.p1522;

import java.util.Scanner;

public class MemberServiceExample2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		MemberService2 memberService = new MemberService2();
		boolean run1 =true;
		while(run1) {
			System.out.println("id�� �Է��ϼ���.");
			String id =sc.nextLine();
			System.out.println("password�� �Է��ϼ���.");
			String password =sc.nextLine();
		
			boolean result =memberService.login(id, password);
			if(result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				run1= false;
			}else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�. �ٽ� �Է¹ٶ��ϴ�.");
				
			}
		}
		boolean run2 =true;
		while(run2) {
			System.out.println("�α׾ƿ��Ͻ÷��� id�� �Է��ϼ���: ");
			String id =sc.nextLine();
			run2 = memberService.logout(id);
		}   
		
	}

}
