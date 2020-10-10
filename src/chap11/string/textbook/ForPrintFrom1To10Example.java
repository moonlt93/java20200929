package chap11.string.textbook;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

		// 1 -> 2 -> code -> 3 -> 2

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		
		}
		System.out.println("----------------------");
		// 11~20
		// 1~9 È¦¼ö¸¸
		// 10~1
		// 10~2 Â¦¼ö¸¸

		for (int i = 11; i <= 20; i++) {
			System.out.println(i);
		
		}
		System.out.println("----------------------");

		for (int i = 1; i < 6; i++) {
			int k = ((2 * i) - 1);
			System.out.println(k);
		
		}
		System.out.println("----------------------");
		
		for (int i = 10; i >= 1; i--) {
			
			System.out.println(i);
		
		}
		System.out.println("----------------------");
		for (int i = 5; i >= 1; i--) {
			int g = 2 * i;

			System.out.println(g);
		}
	}
}
