package chap05.Exercises.alotsof;

import java.util.Scanner;

public class exercisesEx2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//점수 입력 한거 출력 까지?
		int[]scores = null;
		int num=0;
		int student=0;
		
		scores=new int[num];
		
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("숫자를 입력하세요=");
			System.out.print("scores[" + i + "]>");
			scores[i] = scanner.nextInt();
			System.out.println("저장된 숫자=" + scores[i]);
		
		}
		

	}

}
