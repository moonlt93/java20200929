package chap06.textbook.excercises.p20;


import java.util.Scanner;

public class BankApplication2 {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int size = 0;

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.���»���|2.���¸��|3.����|4.���|5.����");
			System.out.println("----------------------");
			System.out.print("����>");

			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = false;
				break;

			}
		}
		System.out.println("���α׷� ����");
	}

	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("���");
		System.out.println("-----------");

		String ano;
		int money;

		System.out.print("���¹�ȣ:");
		ano = scanner.next();
		System.out.print("��ݾ�:");
		money = scanner.nextInt();

		Account cur = findAccount(ano);
		int sum = cur.getBalance() - money;
		cur.setBalance(sum);		

		System.out.println("����� �����Ǿ����ϴ�.");
		
		
		
		
	}

	private static void deposit() {
		System.out.println("-----------");
		System.out.println("����");
		System.out.println("-----------");

		String ano;
		int money;

		System.out.print("���¹�ȣ:");
		ano = scanner.next();
		System.out.print("���ݾ�:");
		money = scanner.nextInt();

		Account cur = findAccount(ano);
		int sum = cur.getBalance() + money;
		cur.setBalance(sum);

		System.out.println("������ �����Ǿ����ϴ�.");
	}

	private static Account findAccount(String ano) {
		for (int i = 0; i < size; i++) {
			if (accountArray[i].getAno().equals(ano)) {
				return accountArray[i];
			}
		}

		return null;
	}

	private static void accountList() {
		System.out.println("-----------");
		System.out.println("���¸��");
		System.out.println("-----------");

		for (int i = 0; i < size; i++) {
			Account cur = accountArray[i];
			System.out.println(cur.getAno() + "\t" + cur.getOwner() + "\t" + cur.getBalance());
		}

	}

	private static void createAccount() {
		String ano;
		String owner;
		int money;

		System.out.println("-----------");
		System.out.println("���»���");
		System.out.println("-----------");
		System.out.print("���¹�ȣ: ");
		ano = scanner.next();
		System.out.print("������: ");
		owner = scanner.next();
		System.out.print("�ʱ��Աݾ�: ");
		money = scanner.nextInt();

		Account account = new Account(ano, owner, money);
		accountArray[size] = account;
		size++;

		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}


}