package chap04.exercises;
//1. sum, i 0���� �ʱ�ȭ ,2. for �Լ� ���� 3. ���

public class Exercise03 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
			sum += i;
		}
			System.out.println(sum);
			//for(; i<=100;;i+=3)
		
		}	
	}
}
