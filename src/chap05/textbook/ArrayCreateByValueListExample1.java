package chap05.textbook;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int[] scores = {83,90,87};
		System.out.println("scores[0]:"+scores[0]);//83
		System.out.println("scores[1]:"+scores[1]);//90
		System.out.println("scores[2]:"+scores[2]);//87
		
		int sum =0;
		for(int i=0; i<3;i++)//0,1,2 ���� �� ����.-> sum ,������ ��� /3
		{
			sum+=scores[i];
		}
	System.out.println("����: " +sum);
	double avg =(double) sum/3;
	System.out.println("��� :"+avg);
	
	
	
	}
	

}
