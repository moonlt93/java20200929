package chap03.textbook;

public class ConditionalOperationExample {

	public static void main(String[] args) 
	//���� ������ 85���� B����Դϴ�.
	{
		int score =85;
		char grade =(score>90) ? 'A':((score>80)? 'B':'C');//90������ a �ƴϸ�  80�Ѵ�? ������ b�ƴϸ� c
		System.out.println(score+"����"+grade+"����Դϴ�.");
	}

}
