package chap03.textbook;

public class ConditionalOperationExample {

	public static void main(String[] args) 
	//삼항 연산자 85점은 B등급입니다.
	{
		int score =85;
		char grade =(score>90) ? 'A':((score>80)? 'B':'C');//90넘으면 a 아니면  80넘니? 넘으면 b아니면 c
		System.out.println(score+"점은"+grade+"등급입니다.");
	}

}
