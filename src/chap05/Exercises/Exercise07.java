package chap05.Exercises;

public class Exercise07 {

	public static void main(String[] args) {

		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			if (array[i] > max) {
				max = array[i];

			}
			
		}
		System.out.println("max: " + max);

//		for¹® ¾øÀÌ 
//		max =(max>array[0])> nax:array[0];
//		max =(max>array[1])> nax:array[1];
//		max =(max>array[2])> nax:array[2];
//		max =(max>array[3])> nax:array[3];
//		max =(max>array[4])> nax:array[4];
		
				int[] array1 = { -1, -5, -3, -8, -2 };


				for (int i = 0; i < array1.length; i++) {
					max = (max > array1[i]) ? max : array1[i];

				}

				System.out.println("max: " + max);
	
		}

}
