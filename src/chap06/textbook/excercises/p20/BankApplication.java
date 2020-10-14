package chap06.textbook.excercises.p20;
//if�� ����ó��.
import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; // account ���� ���� ��ü �ƴ� nullx100
	private static Scanner scanner = new Scanner(System.in); // ��ĳ�� ��ü ctrl shift +5
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;
	
		

		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.���� ���� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("-----------------------------------------------------");
			System.out.print("����>");

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
			System.out.println("���α׷� ����");
		
		
		
		}
		
	
	
	// ���� �����ϱ�
	private static void createAccount() {

		String ano;
		String owner;
		int money;
		// ����
		// ����Ʈ �� next ����
		// Account array ���� ���� ����
		// sout
		System.out.println("-------------");
		System.out.println("���»���-->");
		System.out.println("-------------");
		System.out.println("���¹�ȣ");
		ano = scanner.next();
		System.out.println("������");
		owner = scanner.next();
		System.out.println("�ʱ� �Աݾ�");
		money = scanner.nextInt();

		Account account = new Account(ano, owner, money);
		accountArray[size] = account;
		size++;

		System.out.println("���°� �����Ǿ����ϴ�.");
		
		

	}

	// �����ϱ�
	private static void deposit() {
		System.out.println("-------------");
		System.out.println("�����ϱ�-->");
		System.out.println("-------------");

		int money;
		String ano;

		System.out.println("���¹�ȣ");
		ano = scanner.next();
		System.out.println("���ݾ�");
		money = scanner.nextInt();

		Account tong = findAccount(ano);
		if(tong==null) {
			System.out.println("���������� �����ϴ�.");
			return;
		}
		int sum = tong.getBalance() + money;
		tong.setBalance(sum);
		System.out.println("������ �����߽��ϴ�.");
		
		// �ۼ���ġ
		


		
	}

	// ����ϱ�
	private static void withdraw() {
		System.out.println("-------------");
		System.out.println("����ϱ�-->");
		System.out.println("-------------");
		int money;
		String ano;
		System.out.println("���¹�ȣ");
		ano = scanner.next();
		System.out.println("��ݾ�");
		money = scanner.nextInt();

		Account tong = findAccount(ano);
		if(tong==null) {
			System.out.println("���������� �����ϴ�.");
			return;
		}
		int sum = tong.getBalance() - money;
		tong.setBalance(sum);
		System.out.println("����� �����߽��ϴ�.");
	// �ۼ���ġ
		if(sum>=0) {
			tong.setBalance(sum);
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}	
			
	}
	// Account �迭���� ano�� ������ Account��ü ã��

	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}

		return null;
	}

//���� ��� 
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");

		for (int i = 0; i < size; i++) {
			Account tong = accountArray[i];
			System.out.println(tong.getAno() + "\t" + tong.getOwner() + "\t" + tong.getBalance());
		}

	}

}
