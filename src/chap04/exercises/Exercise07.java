package chap04.exercises;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("=======================================");
			System.out.println("1.����" + "2:���" + "3.�ܰ�" + "4.����");
			System.out.println("=======================================");
			System.out.print("����>");

//			String money = scanner.nextLine();
//			int moneyA = Integer.valueOf(money);
//
//			if (moneyA == 1) {
//				System.out.print("���ݾ� = ");
//				String T = scanner.nextLine();
//				int Z = Integer.valueOf(T);
//				balance += Z;
//			} else if (moneyA == 2) {
//				System.out.print("��ݾ� = ");
//				balance -= scanner.nextInt();
//			} else if (moneyA == 3) {
//				System.out.print("�ܰ� = ");
//				System.out.println(balance);
//			} else if (moneyA == 4) {
//				run = false;
//			}
//
//		}
//
//		System.out.println("�̿� ����");

			String c = scanner.nextLine();

			switch (c) {
			case "1":
				System.out.print("���ݾ�>");
				String moneyStr1 = scanner.nextLine();
				int money1 = Integer.valueOf(moneyStr1);
				balance = balance + money1;
				break;
			case "2":
				System.out.print("��ݾ�>");
				String moneyStr2 = scanner.nextLine();
				int money2 = Integer.valueOf(moneyStr2);
				balance = balance - money2;
				break;
			case "3":
				System.out.println("�ܰ�>" + balance);
				break;
			case "4":
				run = false;
				break;

			}
			
		}
		System.out.println("�̿� ����");
	}
}
