package chap04.exercises;


import java.util.Scanner;

public class Exercise07Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Scanner ��ü�� heap ������ ���� ����.�Ϲ� �Լ��� �ٸ��� ���� �Լ��� heap ������ ����.  
		
		
		System.out.println("�Է�");
		String line =scanner.nextLine(); //string ������ ���θ���� ����.
		
		System.out.println("���");
		System.out.println(line);//����� string ������ ��� 
		
		int num = Integer.valueOf(line);// valueOf�� ���� ���ϴ� �������� ���氡��. line�� string�������� ����� �����̹Ƿ� ������ ��ȯ�ؼ� ���.
		int i = num * 2;   
		System.out.println(i);
		
	
	}

}
