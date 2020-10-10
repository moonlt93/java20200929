package chap05.Exercises.alotsof;

public class exercsies {

	public static void main(String[] args) {
		
		int max = Integer.MIN_VALUE;
		int min =0;
		int[] array = {- 1, -5, -3,- 8, -2 };

		for (int i = 0; i < array.length; i++) {
			// System.out.println(array[i]);
			if (array[i] > max) {
				max = array[i];

			}else if(array[i]<min) {
				min = array[i];
			}
			
		}
		System.out.println("max: " + max);
		System.out.println("min: "+min);
	
		}
		
}


