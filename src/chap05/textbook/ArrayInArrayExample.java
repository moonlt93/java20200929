package chap05.textbook;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores[" + i + "][" + k + "]=" 
														+ mathScores[i][k]);
			}
		}
		System.out.println();

		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for (int i = 0; i < englishScores.length; i++) {
			for (int k = 0; k < englishScores[i].length; k++) {
				System.out.println("englishScores[" + i + "][" + k + "]=" 
														+ englishScores[i][k]);
			}
		}
		System.out.println();

		int[][] javaScores = {{95, 80}, {92, 96, 80}}; // 배열[i][k]에서 i가 0,1 k가 0,1,2인데 안쪽for문이 돌때 i=0일때 => 두가지 값. i=1일때 => 3가지값이나온다.
		for (int i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores[" + i + "][" + k + "]=" 
														+ javaScores[i][k]);
			}
		}
		System.out.println();
	}
}