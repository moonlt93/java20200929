package chap05.Exercises;
import java.util.Scanner;

public class Exercise09Scanner {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("�Է�>");
		String str=scanner.nextLine();
		int val = Integer.valueOf(str);
		
		System.out.println("���>:");
		System.out.println(str);
		System.out.println(val);
		
		System.out.println("�����Է�>");
		val = scanner.nextInt();
		System.out.println(val);
	
		System.out.println("�������>");
		System.out.println(val);
	}

}
