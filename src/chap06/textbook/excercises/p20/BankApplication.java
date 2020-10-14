package chap06.textbook.excercises.p20;
//if문 예외처리.
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; // account 참조 공간 객체 아님 nullx100
	private static Scanner scanner = new Scanner(System.in); // 스캐너 객체 ctrl shift +5
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;
	
		

		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
		

			if (selectNo == 1) {
				createAccount();
		} else if (selectNo == 2) {
			accountList();
		} else if (selectNo == 3) {
			deposit();
		} else if (selectNo == 4) {
			withdraw();
		} else if (selectNo == 5) {
			run = false;
		}
		}
			System.out.println("프로그램 종료");
		
		
		
		}
		
	
	
	// 계좌 생성하기
	private static void createAccount() {

		String ano;
		String owner;
		int money;
		// 변수
		// 프린트 및 next 저장
		// Account array 통한 계좌 생성
		// sout
		System.out.println("-------------");
		System.out.println("계좌생성-->");
		System.out.println("-------------");
		System.out.println("계좌번호");
		ano = scanner.next();
		System.out.println("소유주");
		owner = scanner.next();
		System.out.println("초기 입금액");
		money = scanner.nextInt();

		Account account = new Account(ano, owner, money);
		accountArray[size] = account;
		size++;

		System.out.println("계좌가 생성되었습니다.");
		
		

	}

	// 예금하기
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("예금하기-->");
		System.out.println("-------------");

		int money;
		String ano;

		System.out.println("계좌번호");
		ano = scanner.next();
		System.out.println("예금액");
		money = scanner.nextInt();

		Account tong = findAccount(ano);
		if(tong==null) {
			System.out.println("계좌정보가 없습니다.");
			return;
		}
		int sum = tong.getBalance() + money;
		tong.setBalance(sum);
		System.out.println("예금이 성공했습니다.");
		
		// 작성위치
		


		
	}

	// 출금하기
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("출금하기-->");
		System.out.println("-------------");
		int money;
		String ano;
		System.out.println("계좌번호");
		ano = scanner.next();
		System.out.println("출금액");
		money = scanner.nextInt();

		Account tong = findAccount(ano);
		if(tong==null) {
			System.out.println("계좌정보가 없습니다.");
			return;
		}
		int sum = tong.getBalance() - money;
		tong.setBalance(sum);
		System.out.println("출금이 성공했습니다.");
	// 작성위치
		if(sum>=0) {
			tong.setBalance(sum);
			System.out.println("출금이 완료되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}	
			
	}
	// Account 배열에서 ano와 동일한 Account객체 찾기

	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}

		return null;
	}

//계좌 목록 
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");

		for (int i = 0; i < size; i++) {
			Account tong = accountArray[i];
			System.out.println(tong.getAno() + "\t" + tong.getOwner() + "\t" + tong.getBalance());
		}

	}

}
