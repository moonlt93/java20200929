package chap05.Exercises.alotsof;

import java.util.Scanner;

public class exercisesEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//���� �Է� �Ѱ� ��� ����?
		int[]scores = null;
		int num=0;
		int student=0;
		
		scores=new int[num];
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("���ڸ� �Է��ϼ���=");
			System.out.print("scores[" + i + "]>");
			scores[i] = scanner.nextInt();
			System.out.println("����� ����=" + scores[i]);
		
		}
		

	}

}
