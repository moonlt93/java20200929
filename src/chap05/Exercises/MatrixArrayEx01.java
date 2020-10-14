package chap05.Exercises;

public class MatrixArrayEx01 {

	public static void main(String[] args) {
		int[][]matrix = new int [3][2];
		
		int [] arr = new int [3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		//System.out.println(matrix[3].length); 4번째는 없..
		
		arr[0]=56;
		arr[1]=88;
		arr[2]=79;
				

		matrix[0][0] = 9;
		matrix[2][0] = 1;



	}

}
