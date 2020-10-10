package chap04.exercises;


import java.util.Scanner;

public class Exercise07Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Scanner 객체를 heap 구역에 새로 만듬.일반 함수와 다르게 참조 함수는 heap 영역에 저장.  
		
		
		System.out.println("입력");
		String line =scanner.nextLine(); //string 변수를 새로만들어 저장.
		
		System.out.println("출력");
		System.out.println(line);//저장된 string 변수를 출력 
		
		int num = Integer.valueOf(line);// valueOf를 통해 원하는 형식으로 변경가능. line은 string형식으로 저장된 변수이므로 정수로 변환해서 사용.
		int i = num * 2;   
		System.out.println(i);
		
	
	}

}
