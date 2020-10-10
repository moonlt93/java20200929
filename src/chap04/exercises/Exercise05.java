package chap04.exercises;

//1. 중첩 for문이 뭔지 생각 2. i, j 범위 생각 3. if문 식 풀이 4.출력 생각
public class Exercise05 {

	public static void main(String[] args) {

//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				
//				if(4*i+5*j==60) {
//					System.out.println("("+i+","+j+")");
//					
//				}
//				
//			}
//		}

		// 4x + 5y = 60
		// 1, 1
		// 1, 2
		// 1, 3
		// :
		// 1, 10
		// 2, 1
		// 2, 2
		// :
		// 2, 10
		// :
		// 10, 10

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int s = (4 * x) + (5 * y);
				if (s == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}

	}

}
